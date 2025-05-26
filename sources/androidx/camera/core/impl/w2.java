package androidx.camera.core.impl;

import a.cb;
import java.util.List;

/* loaded from: classes2.dex */
public final class w2 {

    /* renamed from: a, reason: collision with root package name */
    public final o2 f16984a;

    /* renamed from: b, reason: collision with root package name */
    public final z2 f16985b;

    /* renamed from: c, reason: collision with root package name */
    public final k f16986c;

    /* renamed from: d, reason: collision with root package name */
    public final List f16987d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16988e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16989f = false;

    public w2(o2 o2Var, z2 z2Var, k kVar, List list) {
        this.f16984a = o2Var;
        this.f16985b = z2Var;
        this.f16986c = kVar;
        this.f16987d = list;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UseCaseAttachInfo{mSessionConfig=");
        sb3.append(this.f16984a);
        sb3.append(", mUseCaseConfig=");
        sb3.append(this.f16985b);
        sb3.append(", mStreamSpec=");
        sb3.append(this.f16986c);
        sb3.append(", mCaptureTypes=");
        sb3.append(this.f16987d);
        sb3.append(", mAttached=");
        sb3.append(this.f16988e);
        sb3.append(", mActive=");
        return cb.m(sb3, this.f16989f, '}');
    }
}
