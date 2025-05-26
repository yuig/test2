package lk0;

import b10.m;
import com.pinterest.api.model.wy0;
import g4.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import x40.f7;
import z40.d0;

/* loaded from: classes5.dex */
public final class d implements uf0.a {

    /* renamed from: a, reason: collision with root package name */
    public static final d f83648a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final m f83649b = new m(new u(), 10);

    public static ArrayList a(List users) {
        Intrinsics.checkNotNullParameter(users, "users");
        List list = users;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(f83649b.a((wy0) it.next()));
        }
        return arrayList;
    }

    public static f7 b(wy0 plankModel) {
        Intrinsics.checkNotNullParameter(plankModel, "plankModel");
        return f83649b.a(plankModel);
    }

    @Override // uf0.a
    public final Object B(Object obj) {
        d0 apolloModel = (d0) obj;
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        return f83649b.m((f7) apolloModel);
    }

    @Override // uf0.a
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        return b((wy0) obj);
    }
}
