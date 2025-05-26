package pc;

import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f99541a;

    /* renamed from: b, reason: collision with root package name */
    public final UUID f99542b;

    /* renamed from: c, reason: collision with root package name */
    public final f0 f99543c;

    /* renamed from: d, reason: collision with root package name */
    public final qc.g f99544d;

    /* renamed from: e, reason: collision with root package name */
    public final List f99545e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f99546f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f99547g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f99548h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f99549i;

    public f(o0 o0Var, UUID uuid, f0 f0Var, qc.g gVar, List list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.f99541a = o0Var;
        this.f99542b = uuid;
        this.f99543c = f0Var;
        this.f99544d = gVar;
        this.f99545e = list;
        this.f99546f = bool;
        this.f99547g = bool2;
        this.f99548h = bool3;
        this.f99549i = bool4;
    }

    public final e a(o0 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        e eVar = new e(operation);
        UUID requestUuid = this.f99542b;
        Intrinsics.checkNotNullParameter(requestUuid, "requestUuid");
        eVar.f99532b = requestUuid;
        f0 executionContext = this.f99543c;
        Intrinsics.checkNotNullParameter(executionContext, "executionContext");
        Intrinsics.checkNotNullParameter(executionContext, "<set-?>");
        eVar.f99533c = executionContext;
        eVar.f99534d = this.f99544d;
        eVar.f99535e = this.f99545e;
        eVar.f99536f = this.f99546f;
        eVar.f99537g = this.f99547g;
        eVar.f99538h = this.f99548h;
        eVar.f99539i = this.f99549i;
        return eVar;
    }
}
