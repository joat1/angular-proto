describe('test app', function () {

    var $rootScope;
    var $controller;
    var $filter;

    beforeEach(module("app"));
    beforeEach(inject(function($injector) {
        $rootScope = $injector.get('$rootScope');
        $controller = $injector.get('$controller');
        $filter = $injector.get('$filter');
        $scope = $rootScope.$new();
    }));
    beforeEach(inject(function($filter) {
        negativeFilter = $filter('negative');
    }));

    it("produce negative values from positive ones", function() {
        result = negativeFilter(55);
        expect(result).toBe(-55);
    });

    it("produce positive values from negative ones", function() {
        result = negativeFilter(-55);
        expect(result).toBe(55);
    });

    it("non-number", function() {
        result = negativeFilter('abcdefg');
        expect(result).toBeNaN();
    });

});
