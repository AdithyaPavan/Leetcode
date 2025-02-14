class ProductOfNumbers {
public:
        vector<int>res;
    ProductOfNumbers() {
        res={1};

    }
    
    void add(int num) {
        if(num==0)res={1};
        else res.push_back(res.back()*num);
    }
    
    int getProduct(int k) {
        int s=res.size();
        return (k<s)?res.back()/res[s-k-1]:0;
    }
};

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers* obj = new ProductOfNumbers();
 * obj->add(num);
 * int param_2 = obj->getProduct(k);
 */