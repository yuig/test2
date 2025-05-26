package j6;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class h extends e3.b {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f74807b;

    /* renamed from: c, reason: collision with root package name */
    public final f f74808c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f74809d;

    public h(TextView textView) {
        super(28);
        this.f74807b = textView;
        this.f74809d = true;
        this.f74808c = new f(textView);
    }

    public static InputFilter[] o(InputFilter[] inputFilterArr) {
        SparseArray sparseArray = new SparseArray(1);
        for (int i13 = 0; i13 < inputFilterArr.length; i13++) {
            InputFilter inputFilter = inputFilterArr[i13];
            if (inputFilter instanceof f) {
                sparseArray.put(i13, inputFilter);
            }
        }
        if (sparseArray.size() == 0) {
            return inputFilterArr;
        }
        int length = inputFilterArr.length;
        InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15++) {
            if (sparseArray.indexOfKey(i15) < 0) {
                inputFilterArr2[i14] = inputFilterArr[i15];
                i14++;
            }
        }
        return inputFilterArr2;
    }

    public static TransformationMethod q(TransformationMethod transformationMethod) {
        return transformationMethod instanceof l ? ((l) transformationMethod).f74816a : transformationMethod;
    }

    @Override // e3.b
    public final InputFilter[] b(InputFilter[] inputFilterArr) {
        if (!this.f74809d) {
            return o(inputFilterArr);
        }
        int length = inputFilterArr.length;
        int i13 = 0;
        while (true) {
            f fVar = this.f74808c;
            if (i13 >= length) {
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
                inputFilterArr2[length] = fVar;
                return inputFilterArr2;
            }
            if (inputFilterArr[i13] == fVar) {
                return inputFilterArr;
            }
            i13++;
        }
    }

    @Override // e3.b
    public final boolean f() {
        return this.f74809d;
    }

    @Override // e3.b
    public final void h(boolean z13) {
        if (z13) {
            TextView textView = this.f74807b;
            textView.setTransformationMethod(n(textView.getTransformationMethod()));
        }
    }

    @Override // e3.b
    public final void k(boolean z13) {
        this.f74809d = z13;
        TextView textView = this.f74807b;
        textView.setTransformationMethod(n(textView.getTransformationMethod()));
        textView.setFilters(b(textView.getFilters()));
    }

    @Override // e3.b
    public final TransformationMethod n(TransformationMethod transformationMethod) {
        return this.f74809d ? ((transformationMethod instanceof l) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new l(transformationMethod) : q(transformationMethod);
    }

    public final void p(boolean z13) {
        this.f74809d = z13;
    }
}
