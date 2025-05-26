package com.pinterest.framework.screens;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class n extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f49214i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Fragment f49215j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Bundle f49216k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Fragment fragment, Bundle bundle, int i13) {
        super(0);
        this.f49214i = i13;
        this.f49215j = fragment;
        this.f49216k = bundle;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Bundle bundle = this.f49216k;
        Fragment fragment = this.f49215j;
        int i13 = this.f49214i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        Method method = me.o.f87007d;
                        if (method != null) {
                            method.invoke(fragment, bundle);
                            break;
                        }
                        break;
                    default:
                        Method method2 = me.o.f87005b;
                        if (method2 != null) {
                            method2.invoke(fragment, bundle);
                            break;
                        }
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        Method method3 = me.o.f87007d;
                        if (method3 != null) {
                            method3.invoke(fragment, bundle);
                            break;
                        }
                        break;
                    default:
                        Method method4 = me.o.f87005b;
                        if (method4 != null) {
                            method4.invoke(fragment, bundle);
                            break;
                        }
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
