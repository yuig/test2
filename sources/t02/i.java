package t02;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.p1;
import androidx.lifecycle.u1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class i extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f115725i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Fragment f115726j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ xk2.k f115727k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Fragment fragment, xk2.k kVar, int i13) {
        super(0);
        this.f115725i = i13;
        this.f115726j = fragment;
        this.f115727k = kVar;
    }

    public final p1 b() {
        androidx.lifecycle.k kVar;
        p1 defaultViewModelProviderFactory;
        p1 defaultViewModelProviderFactory2;
        p1 defaultViewModelProviderFactory3;
        p1 defaultViewModelProviderFactory4;
        p1 defaultViewModelProviderFactory5;
        p1 defaultViewModelProviderFactory6;
        p1 defaultViewModelProviderFactory7;
        p1 defaultViewModelProviderFactory8;
        int i13 = this.f115725i;
        Fragment fragment = this.f115726j;
        xk2.k kVar2 = this.f115727k;
        switch (i13) {
            case 0:
                u1 u1Var = (u1) kVar2.getValue();
                kVar = u1Var instanceof androidx.lifecycle.k ? (androidx.lifecycle.k) u1Var : null;
                if (kVar != null && (defaultViewModelProviderFactory = kVar.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                p1 defaultViewModelProviderFactory9 = fragment.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory9, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory9;
            case 1:
                u1 u1Var2 = (u1) kVar2.getValue();
                kVar = u1Var2 instanceof androidx.lifecycle.k ? (androidx.lifecycle.k) u1Var2 : null;
                if (kVar != null && (defaultViewModelProviderFactory2 = kVar.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory2;
                }
                p1 defaultViewModelProviderFactory10 = fragment.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory10, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory10;
            case 2:
                u1 u1Var3 = (u1) kVar2.getValue();
                kVar = u1Var3 instanceof androidx.lifecycle.k ? (androidx.lifecycle.k) u1Var3 : null;
                if (kVar != null && (defaultViewModelProviderFactory3 = kVar.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory3;
                }
                p1 defaultViewModelProviderFactory11 = fragment.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory11, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory11;
            case 3:
                u1 u1Var4 = (u1) kVar2.getValue();
                kVar = u1Var4 instanceof androidx.lifecycle.k ? (androidx.lifecycle.k) u1Var4 : null;
                if (kVar != null && (defaultViewModelProviderFactory4 = kVar.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory4;
                }
                p1 defaultViewModelProviderFactory12 = fragment.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory12, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory12;
            case 4:
                u1 u1Var5 = (u1) kVar2.getValue();
                kVar = u1Var5 instanceof androidx.lifecycle.k ? (androidx.lifecycle.k) u1Var5 : null;
                if (kVar != null && (defaultViewModelProviderFactory5 = kVar.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory5;
                }
                p1 defaultViewModelProviderFactory13 = fragment.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory13, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory13;
            case 5:
                u1 u1Var6 = (u1) kVar2.getValue();
                kVar = u1Var6 instanceof androidx.lifecycle.k ? (androidx.lifecycle.k) u1Var6 : null;
                if (kVar != null && (defaultViewModelProviderFactory6 = kVar.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory6;
                }
                p1 defaultViewModelProviderFactory14 = fragment.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory14, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory14;
            case 6:
                u1 u1Var7 = (u1) kVar2.getValue();
                kVar = u1Var7 instanceof androidx.lifecycle.k ? (androidx.lifecycle.k) u1Var7 : null;
                if (kVar != null && (defaultViewModelProviderFactory7 = kVar.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory7;
                }
                p1 defaultViewModelProviderFactory15 = fragment.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory15, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory15;
            default:
                u1 u1Var8 = (u1) kVar2.getValue();
                kVar = u1Var8 instanceof androidx.lifecycle.k ? (androidx.lifecycle.k) u1Var8 : null;
                if (kVar != null && (defaultViewModelProviderFactory8 = kVar.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory8;
                }
                p1 defaultViewModelProviderFactory16 = fragment.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory16, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory16;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f115725i) {
        }
        return b();
    }
}
