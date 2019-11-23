const request = require("request");
const expect = require("chai").expect;
const baseUrl = "https://restcountries.eu/rest/v2";

describe('Test 1: Status 200', function() {
    it('Status 200', function(done) {
        request.get({ url: baseUrl + '/name/chile/' },
            function(error, response, body) {
                    expect(response.statusCode).to.equal(200);
                done();
            });
    });
});

describe('Test 2: Mensaje OK', function() {
    it('Mensaje OK', function(done) {
        request.get({ url: baseUrl + '/name/chile/' },
            function(error, response, body) {
                    expect(response.statusCode).to.be.ok;
                done();
            });
    });
});

describe('Test 3: Formato JSON', function() {
    it('Formato JSON', function(done) {
        request.get({ url: baseUrl + '/name/chile/' },
            function(error, response, body) {
                    const bodyObj = JSON.parse(body);
                    var jsonData;
                    for (var i = 0; i < bodyObj.length; i++) {
                        jsonData = bodyObj[i];
                    }
                    expect(jsonData).to.be.json;
                done();
            });
    });
});

describe('Test 4: Retorna "Chile"', function() {
    it('Retorna "Chile"', function(done) {
        request.get({ url: baseUrl + '/name/chile/' },
            function(error, response, body) {
                    const bodyObj = JSON.parse(body);
                    var jsonData;
                    for (var i = 0; i < bodyObj.length; i++) {
                        jsonData = bodyObj[i];
                    }
            		expect(jsonData.name).to.equal("Chile");
                done();
            });
    });
});

describe('Test 5: population es número', function() {
    it('population es número', function(done) {
        request.get({ url: baseUrl + '/name/chile/' },
            function(error, response, body) {
                    const bodyObj = JSON.parse(body);
                    var jsonData;
                    for (var i = 0; i < bodyObj.length; i++) {
                        jsonData = bodyObj[i];
                    }
                    expect(jsonData.population).to.be.a('number')
                done();
            });
    });
});

describe('Test 6: Estructura JSON', function() {
    it('Estructura JSON', function(done) {
        request.get({ url: baseUrl + '/name/chile/' },
            function(error, response, body) {
                    const bodyObj = JSON.parse(body);
                    var jsonData;
                    for (var i = 0; i < bodyObj.length; i++) {
                        jsonData = bodyObj[i];
                    }
                    expect(jsonData).to.be.jsonSchema;
                done();
            });
    });
});
