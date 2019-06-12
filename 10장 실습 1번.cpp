#include <iostream>
using namespace std;
template<typename B> B biggest(B a[], int s) {
	B max = a[0];
	for (int i = 1; i < s; i++) {
		if (max < a[i])
		{
			max = a[i];
		}
	}
		return max;
}
int main(void) {
	int x[] = { 1,10,100,5,4 };
	cout << biggest(x, 5) << endl;
	int ex[] = { 1,2,3,4,5 };
	cout << biggest(ex, 5) << endl;
}