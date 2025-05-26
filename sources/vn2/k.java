package vn2;

import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final ym2.g f126330a;

    /* renamed from: b, reason: collision with root package name */
    public final Regex f126331b;

    /* renamed from: c, reason: collision with root package name */
    public final Collection f126332c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f126333d;

    /* renamed from: e, reason: collision with root package name */
    public final e[] f126334e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(Collection nameList, e[] checks, Function1 additionalChecks) {
        this(null, null, nameList, additionalChecks, (e[]) Arrays.copyOf(checks, checks.length));
        Intrinsics.checkNotNullParameter(nameList, "nameList");
        Intrinsics.checkNotNullParameter(checks, "checks");
        Intrinsics.checkNotNullParameter(additionalChecks, "additionalChecks");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(ym2.g name, e[] checks, Function1 additionalChecks) {
        this(name, null, null, additionalChecks, (e[]) Arrays.copyOf(checks, checks.length));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(checks, "checks");
        Intrinsics.checkNotNullParameter(additionalChecks, "additionalChecks");
    }

    public k(ym2.g gVar, Regex regex, Collection collection, Function1 function1, e... eVarArr) {
        this.f126330a = gVar;
        this.f126331b = regex;
        this.f126332c = collection;
        this.f126333d = function1;
        this.f126334e = eVarArr;
    }

    public /* synthetic */ k(ym2.g gVar, e[] eVarArr) {
        this(gVar, eVarArr, h.f126322i);
    }

    public /* synthetic */ k(Collection collection, e[] eVarArr) {
        this(collection, eVarArr, j.f126328i);
    }
}
