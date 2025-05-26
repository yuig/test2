package j6;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import h6.m;

/* loaded from: classes.dex */
public final class i extends e3.b {

    /* renamed from: b, reason: collision with root package name */
    public final h f74810b;

    public i(TextView textView) {
        super(28);
        this.f74810b = new h(textView);
    }

    @Override // e3.b
    public final InputFilter[] b(InputFilter[] inputFilterArr) {
        return m.c() ^ true ? inputFilterArr : this.f74810b.b(inputFilterArr);
    }

    @Override // e3.b
    public final boolean f() {
        return this.f74810b.f74809d;
    }

    @Override // e3.b
    public final void h(boolean z13) {
        if (!m.c()) {
            return;
        }
        this.f74810b.h(z13);
    }

    @Override // e3.b
    public final void k(boolean z13) {
        boolean z14 = !m.c();
        h hVar = this.f74810b;
        if (z14) {
            hVar.p(z13);
        } else {
            hVar.k(z13);
        }
    }

    @Override // e3.b
    public final TransformationMethod n(TransformationMethod transformationMethod) {
        return m.c() ^ true ? transformationMethod : this.f74810b.n(transformationMethod);
    }
}
