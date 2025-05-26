package kotlin.text;

import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import yn2.g0;

/* loaded from: classes2.dex */
public final class i extends kotlin.collections.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f80492a;

    public i(j jVar) {
        this.f80492a = jVar;
    }

    @Override // kotlin.collections.b
    public final int b() {
        return this.f80492a.f80493a.groupCount() + 1;
    }

    public final MatchGroup c(int i13) {
        j jVar = this.f80492a;
        Matcher matcher = jVar.f80493a;
        IntRange q13 = ql2.s.q(matcher.start(i13), matcher.end(i13));
        if (q13.f80453a < 0) {
            return null;
        }
        String group = jVar.f80493a.group(i13);
        Intrinsics.checkNotNullExpressionValue(group, "group(...)");
        return new MatchGroup(group, q13);
    }

    @Override // kotlin.collections.b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null || (obj instanceof MatchGroup)) {
            return super.contains((MatchGroup) obj);
        }
        return false;
    }

    @Override // kotlin.collections.b, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new g0(yn2.c0.p(CollectionsKt.K(kotlin.collections.f0.h(this)), new h(this)));
    }
}
