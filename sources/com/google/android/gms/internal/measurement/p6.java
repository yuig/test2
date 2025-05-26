package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class p6 extends o6 {
    @Override // com.google.android.gms.internal.measurement.o6
    public final void a(long j13, Object obj, Object obj2) {
        i6 i6Var = (i6) x7.r(j13, obj);
        i6 i6Var2 = (i6) x7.r(j13, obj2);
        int size = i6Var.size();
        int size2 = i6Var2.size();
        if (size > 0 && size2 > 0) {
            if (!((i5) i6Var).f31439a) {
                i6Var = i6Var.zza(size2 + size);
            }
            i6Var.addAll(i6Var2);
        }
        if (size > 0) {
            i6Var2 = i6Var;
        }
        x7.d(j13, obj, i6Var2);
    }

    @Override // com.google.android.gms.internal.measurement.o6
    public final void b(long j13, Object obj) {
        i5 i5Var = (i5) ((i6) x7.r(j13, obj));
        if (i5Var.f31439a) {
            i5Var.f31439a = false;
        }
    }
}
