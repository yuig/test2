package com.pinterest.shuffles.scene.composer;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class w extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f52160i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f52161j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f52162k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f52163l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i13, int i14, Object obj, int i15) {
        super(0);
        this.f52160i = i15;
        this.f52161j = i13;
        this.f52162k = i14;
        this.f52163l = obj;
    }

    public final String b() {
        int i13 = this.f52160i;
        int i14 = this.f52162k;
        int i15 = this.f52161j;
        Object obj = this.f52163l;
        switch (i13) {
            case 0:
                StringBuilder t13 = a.a.t("onChanged(): position=", i15, ", count=", i14, ", payload=");
                t13.append(obj);
                return t13.toString();
            default:
                StringBuilder t14 = a.a.t("onUpdated(): position=", i15, ", count=", i14, ", payload=");
                t14.append((i) obj);
                return t14.toString();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f52160i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                m122invoke();
                break;
            default:
                m122invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m122invoke() {
        int i13 = this.f52160i;
        Object obj = this.f52163l;
        switch (i13) {
            case 2:
                GLES20.glReadPixels(0, 0, this.f52161j, this.f52162k, 6408, 5121, (ByteBuffer) obj);
                break;
            default:
                GLES20.glReadPixels(0, 0, this.f52161j, this.f52162k, 6408, 5121, ((he2.f) obj).f68983k.f68962a);
                break;
        }
    }
}
