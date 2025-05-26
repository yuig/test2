package ba;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import androidx.lifecycle.c1;
import androidx.lifecycle.l1;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a extends l1 {

    /* renamed from: b, reason: collision with root package name */
    public final String f22251b = "SaveableStateHolder_BackStackEntryKey";

    /* renamed from: c, reason: collision with root package name */
    public final UUID f22252c;

    /* renamed from: d, reason: collision with root package name */
    public WeakReference f22253d;

    public a(@NotNull c1 c1Var) {
        Object obj;
        LinkedHashMap linkedHashMap = c1Var.f18601a;
        Intrinsics.checkNotNullParameter("SaveableStateHolder_BackStackEntryKey", "key");
        try {
            obj = linkedHashMap.get("SaveableStateHolder_BackStackEntryKey");
        } catch (ClassCastException unused) {
            Intrinsics.checkNotNullParameter("SaveableStateHolder_BackStackEntryKey", "key");
            linkedHashMap.remove("SaveableStateHolder_BackStackEntryKey");
            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(c1Var.f18603c.remove("SaveableStateHolder_BackStackEntryKey"));
            c1Var.f18604d.remove("SaveableStateHolder_BackStackEntryKey");
            obj = null;
        }
        UUID uuid = (UUID) obj;
        if (uuid == null) {
            uuid = UUID.randomUUID();
            c1Var.c(uuid, this.f22251b);
        }
        this.f22252c = uuid;
    }

    @Override // androidx.lifecycle.l1
    public final void g() {
        WeakReference weakReference = this.f22253d;
        if (weakReference == null) {
            Intrinsics.r("saveableStateHolderRef");
            throw null;
        }
        r2.d dVar = (r2.d) weakReference.get();
        if (dVar != null) {
            dVar.a(this.f22252c);
        }
        WeakReference weakReference2 = this.f22253d;
        if (weakReference2 != null) {
            weakReference2.clear();
        } else {
            Intrinsics.r("saveableStateHolderRef");
            throw null;
        }
    }
}
