from flask import request, render_template
import requests
import urllib.request
import os
import urllib

from flask import Flask

app = Flask(__name__)
DAT = {'tipo': 2, 'nombre': "xavier", 'telefono': "0983037178", 'correo':"www.www.www"}

@app.route('/error')
def error():
    return {"error": "error"}

@app.route('/get_datos')
def get_datos():
    return DAT

@app.route('/')
def home():
    return render_template("index.html")

@app.route('/obtener', methods=['POST'])
def sendDatos():
    if request.method == 'POST':
        id_usr = request.form['id_usr']
        raza = request.form['raza']
        dat = {'tipo': 1, 'id_usr': id_usr, "raza": raza}
        DAT.update(dat)
        url = "http://localhost:8081"
        r = requests.get(url=url, params=dat)
        js = r.json()
        print(js)
        if js['estado']:
            return render_template("index.html", datos=js)
    return render_template("error.html")

if __name__ == '__main__':
    app.run(port=4444)
