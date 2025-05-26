package uf;

import f0.h;
import java.text.DecimalFormat;

/* loaded from: classes3.dex */
public final class b extends h {

    /* renamed from: b, reason: collision with root package name */
    public DecimalFormat f122086b;

    public b(int i13) {
        t0(i13);
    }

    @Override // f0.h
    public final String G(float f13) {
        return this.f122086b.format(f13);
    }

    public final void t0(int i13) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i14 = 0; i14 < i13; i14++) {
            if (i14 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.f122086b = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }
}
