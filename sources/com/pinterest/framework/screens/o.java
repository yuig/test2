package com.pinterest.framework.screens;

import androidx.fragment.app.Fragment;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f49217i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Fragment f49218j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Fragment fragment, int i13) {
        super(0);
        this.f49217i = i13;
        this.f49218j = fragment;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m121invoke() {
        int i13 = this.f49217i;
        Fragment fragment = this.f49218j;
        switch (i13) {
            case 0:
                Method method = me.o.f87004a;
                if (method != null) {
                    method.invoke(fragment, new Object[0]);
                    break;
                }
                break;
            case 1:
                Method method2 = me.o.f87010g;
                if (method2 != null) {
                    method2.invoke(fragment, new Object[0]);
                    break;
                }
                break;
            case 2:
                Method method3 = me.o.f87009f;
                if (method3 != null) {
                    method3.invoke(fragment, new Object[0]);
                    break;
                }
                break;
            case 3:
                Method method4 = me.o.f87008e;
                if (method4 != null) {
                    method4.invoke(fragment, new Object[0]);
                    break;
                }
                break;
            default:
                Method method5 = me.o.f87011h;
                if (method5 != null) {
                    method5.invoke(fragment, new Object[0]);
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f49217i) {
            case 0:
                m121invoke();
                break;
            case 1:
                m121invoke();
                break;
            case 2:
                m121invoke();
                break;
            case 3:
                m121invoke();
                break;
            default:
                m121invoke();
                break;
        }
        return Unit.f80348a;
    }
}
