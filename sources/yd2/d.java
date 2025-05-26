package yd2;

import kotlin.text.t;

/* loaded from: classes4.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final ae2.d[] f138800a;

    public d(ae2.d[] dVarArr) {
        this.f138800a = dVarArr;
        if (dVarArr.length <= 36063) {
            return;
        }
        throw new IllegalArgumentException(t.b("\"\n                can't attach " + dVarArr.length + " textures to DRAW target\n                System supports only up to 36063 attachments\n            ").toString());
    }
}
