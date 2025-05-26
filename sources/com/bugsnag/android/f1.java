package com.bugsnag.android;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* loaded from: classes3.dex */
public final class f1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final f1 f29215j = new f1(0);

    /* renamed from: k, reason: collision with root package name */
    public static final f1 f29216k = new f1(1);

    /* renamed from: l, reason: collision with root package name */
    public static final f1 f29217l = new f1(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f29218i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(int i13) {
        super(1);
        this.f29218i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f29218i) {
            case 0:
                return Unit.f80348a;
            case 1:
                return new Regex("\\s").replace((String) obj, "");
            default:
                String str = (String) obj;
                return Boolean.valueOf(kotlin.text.z.p(str, "ro.debuggable=[1]", false) || kotlin.text.z.p(str, "ro.secure=[0]", false));
        }
    }
}
