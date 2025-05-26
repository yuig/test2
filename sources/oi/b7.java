package oi;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes3.dex */
public final class b7 implements d4, h7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a7 f94703a;

    public /* synthetic */ b7(a7 a7Var) {
        this.f94703a = a7Var;
    }

    @Override // oi.h7
    public final void a(String str, String str2, Bundle bundle) {
        boolean isEmpty = TextUtils.isEmpty(str);
        a7 a7Var = this.f94703a;
        if (!isEmpty) {
            a7Var.zzl().y(new n.g(this, str, str2, bundle, 7));
            return;
        }
        u4 u4Var = a7Var.f94666l;
        if (u4Var != null) {
            y3 y3Var = u4Var.f95205i;
            u4.d(y3Var);
            y3Var.f95268f.b(str2, "AppId not known when logging event");
        }
    }

    @Override // oi.d4
    public final void b(String str, int i13, Throwable th3, byte[] bArr, Map map) {
        this.f94703a.m(str, i13, th3, bArr, map);
    }
}
