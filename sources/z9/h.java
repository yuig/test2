package z9;

import android.os.Bundle;
import androidx.lifecycle.c1;
import androidx.lifecycle.e1;
import androidx.lifecycle.g1;
import androidx.lifecycle.l1;
import androidx.lifecycle.p1;
import androidx.lifecycle.r1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h extends r1 implements p1 {

    /* renamed from: a, reason: collision with root package name */
    public ma.g f141197a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.lifecycle.s f141198b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f141199c;

    @Override // androidx.lifecycle.p1
    public final l1 b(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String key = modelClass.getCanonicalName();
        if (key == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        if (this.f141198b == null) {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        ma.g gVar = this.f141197a;
        Intrinsics.f(gVar);
        androidx.lifecycle.s sVar = this.f141198b;
        Intrinsics.f(sVar);
        e1 f13 = jk.r.f(gVar, sVar, key, this.f141199c);
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        c1 handle = f13.f18616b;
        Intrinsics.checkNotNullParameter(handle, "handle");
        i iVar = new i(handle);
        iVar.d(f13);
        return iVar;
    }

    @Override // androidx.lifecycle.p1
    public final l1 c(Class modelClass, u6.e extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String key = (String) extras.a(w6.c.f128111a);
        if (key == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        ma.g gVar = this.f141197a;
        if (gVar == null) {
            c1 handle = g1.a(extras);
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(handle, "handle");
            return new i(handle);
        }
        Intrinsics.f(gVar);
        androidx.lifecycle.s sVar = this.f141198b;
        Intrinsics.f(sVar);
        e1 f13 = jk.r.f(gVar, sVar, key, this.f141199c);
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        c1 handle2 = f13.f18616b;
        Intrinsics.checkNotNullParameter(handle2, "handle");
        i iVar = new i(handle2);
        iVar.d(f13);
        return iVar;
    }

    @Override // androidx.lifecycle.r1
    public final void d(l1 viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        ma.g gVar = this.f141197a;
        if (gVar != null) {
            androidx.lifecycle.s sVar = this.f141198b;
            Intrinsics.f(sVar);
            jk.r.e(viewModel, gVar, sVar);
        }
    }
}
