package c71;

import kotlin.jvm.internal.Intrinsics;
import t3.s1;

/* loaded from: classes5.dex */
public final class a extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    public final String f26720a;

    public a(m mVar, h61.h searchType, kotlin.jvm.internal.p callable) {
        Intrinsics.checkNotNullParameter(searchType, "searchType");
        Intrinsics.checkNotNullParameter(callable, "callable");
        this.f26720a = s1.c("GraphQLSearchGridPresenter: Incompatible search type ", searchType.name(), " thrown by ", callable.getName());
        if (!mVar.f26811y) {
            ((m60.d) mVar.f26797k).g();
            mVar.f26811y = true;
        }
        vb0.j.f125466a.J(this, tb0.p.PLATFORM);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f26720a;
    }
}
