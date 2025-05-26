package ht1;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k implements et1.e {

    /* renamed from: a, reason: collision with root package name */
    public final mt1.a f70261a;

    /* renamed from: b, reason: collision with root package name */
    public final mt1.a f70262b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ et1.e f70263c;

    public k(v0 mixAudio, v0 setInputFormat, et1.v0 component) {
        Intrinsics.checkNotNullParameter(mixAudio, "mixAudio");
        Intrinsics.checkNotNullParameter(setInputFormat, "setInputFormat");
        Intrinsics.checkNotNullParameter(component, "component");
        this.f70261a = mixAudio;
        this.f70262b = setInputFormat;
        this.f70263c = component;
    }

    @Override // et1.e
    public final String d(Object obj) {
        return this.f70263c.d(obj);
    }

    @Override // et1.e
    public final void h(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f70263c.h(callback);
    }

    @Override // et1.e
    public final void j(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f70263c.j(callback);
    }
}
