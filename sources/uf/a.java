package uf;

import f0.h;
import java.text.DecimalFormat;

/* loaded from: classes3.dex */
public final class a extends h {

    /* renamed from: b */
    public final DecimalFormat f122084b;

    /* renamed from: c */
    public final int f122085c;

    public a(int i13) {
        this.f122085c = i13;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i14 = 0; i14 < i13; i14++) {
            if (i14 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.f122084b = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }

    @Override // f0.h
    public final String G(float f13) {
        return this.f122084b.format(f13);
    }
}
