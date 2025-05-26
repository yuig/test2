package oi;

import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class m4 extends g1.r {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k4 f94951g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(k4 k4Var) {
        super(20);
        this.f94951g = k4Var;
    }

    @Override // g1.r
    public final Object a(Object obj) {
        com.google.android.gms.internal.measurement.s2 s2Var;
        LinkedHashMap linkedHashMap;
        String str = (String) obj;
        com.bumptech.glide.d.o(str);
        k4 k4Var = this.f94951g;
        k4Var.t();
        com.bumptech.glide.d.o(str);
        if (TextUtils.isEmpty(str) || (s2Var = (com.google.android.gms.internal.measurement.s2) k4Var.f94899h.get(str)) == null || s2Var.r() == 0) {
            return null;
        }
        if (!k4Var.f94899h.containsKey(str) || k4Var.f94899h.get(str) == null) {
            k4Var.L(str);
        } else {
            k4Var.B(str, (com.google.android.gms.internal.measurement.s2) k4Var.f94899h.get(str));
        }
        m4 m4Var = k4Var.f94901j;
        synchronized (m4Var.f63307c) {
            linkedHashMap = new LinkedHashMap(m4Var.f63306b.d().size());
            for (Map.Entry entry : m4Var.f63306b.d()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return (com.google.android.gms.internal.measurement.w) linkedHashMap.get(str);
    }
}
