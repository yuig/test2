package fp;

import fk2.g;
import java.util.HashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m1.e0;
import no1.d;
import tk2.e;
import wj2.c;
import x40.b1;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f62753b = new b();

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f62754a = new HashSet();

    public final void a(d contactRequestRemoteDataSource, Function0 function0) {
        Intrinsics.checkNotNullParameter(contactRequestRemoteDataSource, "contactRequestRemoteDataSource");
        HashSet contactRequestIds = this.f62754a;
        contactRequestRemoteDataSource.getClass();
        Intrinsics.checkNotNullParameter(contactRequestIds, "contactRequestIds");
        g i13 = com.bumptech.glide.d.u0(contactRequestRemoteDataSource.f91666a.a(new b1(CollectionsKt.F0(contactRequestIds)))).r(e.f118017c).l(c.a()).i();
        Intrinsics.checkNotNullExpressionValue(i13, "ignoreElement(...)");
        i13.i(new a(0, this, function0), new vo.a(25, new e0(3, function0)));
    }

    public final boolean c() {
        return this.f62754a.isEmpty();
    }
}
