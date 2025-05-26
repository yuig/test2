package xv0;

import com.pinterest.api.model.wx;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class c extends wx {

    /* renamed from: a, reason: collision with root package name */
    public final int f136020a;

    /* renamed from: b, reason: collision with root package name */
    public final int f136021b;

    public /* synthetic */ c(int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, i14);
    }

    @Override // dl1.s
    public final String b() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    private c(int i13, int i14) {
        this.f136020a = i13;
        this.f136021b = i14;
    }
}
