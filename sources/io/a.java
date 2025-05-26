package io;

import e2.u;

/* loaded from: classes3.dex */
public abstract class a implements e {

    /* renamed from: b, reason: collision with root package name */
    public final u f72906b;

    public a(u uVar) {
        this.f72906b = uVar;
    }

    public static int b(int i13, int i14) {
        if (i14 > i13) {
            return 0;
        }
        if (i14 == 0) {
            return 1;
        }
        int i15 = 1;
        for (int i16 = 1; i16 <= i14; i16++) {
            i15 = (i15 * i13) / i16;
            i13--;
        }
        return i15;
    }
}
