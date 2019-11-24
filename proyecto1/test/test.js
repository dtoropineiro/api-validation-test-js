const request = require("request");
const expect = require("chai").expect;
const endpoint = "https://1debf0df-7183-4cba-b894-81e177e5ff53.mock.pstmn.io/cliente";

describe('Test 1: Status 200', function() {
    it('Status 200', function(done) {
        request.get({ url: endpoint},
            function(error, response, body) {
                    expect(response.statusCode).to.equal(200);
                done();
            });
    });
});

describe('Test 2: Mensaje OK', function() {
    it('Mensaje OK', function(done) {
        request.get({ url: endpoint},
            function(error, response, body) {
                    expect(response.statusCode).to.be.ok;
                done();
            });
    });
});

describe('Test 3: Formato JSON', function() {
    it('Formato JSON', function(done) {
        request.get({ url: endpoint},
            function(error, response, body) {
                    const bodyObj = JSON.parse(body);
                    expect(bodyObj).to.be.json;
                done();
            });
    });
});

describe('Test 4: Retorna nombre "Pepito"', function() {
    it('Retorna "Pepito"', function(done) {
        request.get({ url: endpoint},
            function(error, response, body) {
                    const bodyObj = JSON.parse(body);
            		expect(bodyObj.Dato_cliente.Nombre).to.equal("Pepito");
                done();
            });
    });
});

describe('Test 5: RUT es número', function() {
    it('RUT es número', function(done) {
        request.get({ url: endpoint},
            function(error, response, body) {
                    const bodyObj = JSON.parse(body);
                    expect(bodyObj.Dato_cliente.RUT).to.be.a('number')
                done();
            });
    });
});

describe('Test 6: Estructura JSON', function() {
    it('Estructura JSON', function(done) {
        request.get({ url: endpoint},
            function(error, response, body) {
                    const bodyObj = JSON.parse(body);
                    expect(bodyObj).to.be.jsonSchema;
                done();
            });
    });
});