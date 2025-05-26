package ny1;

import android.app.Activity;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import pk.a0;

/* loaded from: classes2.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public final List f92674a;

    /* renamed from: b, reason: collision with root package name */
    public final List f92675b;

    /* renamed from: c, reason: collision with root package name */
    public final List f92676c;

    /* renamed from: d, reason: collision with root package name */
    public final List f92677d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f92678e;

    public n(List permissionIds, List explanationIds, List explanationFormatArgsList, List partialPermissionIds, int i13) {
        explanationFormatArgsList = (i13 & 4) != 0 ? q0.f80391a : explanationFormatArgsList;
        partialPermissionIds = (i13 & 8) != 0 ? q0.f80391a : partialPermissionIds;
        Intrinsics.checkNotNullParameter(permissionIds, "permissionIds");
        Intrinsics.checkNotNullParameter(explanationIds, "explanationIds");
        Intrinsics.checkNotNullParameter(explanationFormatArgsList, "explanationFormatArgsList");
        Intrinsics.checkNotNullParameter(partialPermissionIds, "partialPermissionIds");
        this.f92674a = permissionIds;
        this.f92675b = explanationIds;
        this.f92676c = explanationFormatArgsList;
        this.f92677d = partialPermissionIds;
        this.f92678e = explanationIds.isEmpty();
        if (explanationIds.size() > 1 && explanationIds.size() != permissionIds.size()) {
            throw new IllegalArgumentException("explanationIds must be empty, size 1 or equal to the size of permissionIds list");
        }
        if ((!explanationFormatArgsList.isEmpty()) && explanationFormatArgsList.size() != explanationIds.size()) {
            throw new IllegalArgumentException("explanationFormatArgsList must be empty or equal to the size of explanationIds list");
        }
    }

    public final boolean a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        List list = this.f92674a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!a0.G0(context, (String) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean b(Activity activity, w permissionsManager, boolean z13) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(permissionsManager, "permissionsManager");
        List list = this.f92674a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        String permissionId = (String) it.next();
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(permissionId, "permissionId");
        return f0.n0(activity, permissionId, z13, permissionsManager.f92712b);
    }

    public vr1.j c(Context context, String explanationText) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(explanationText, "explanationText");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(explanationText, "explanationText");
        vr1.j jVar = new vr1.j(context);
        String string = jVar.getResources().getString(py1.b.permission_explanation_header);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        jVar.w(string);
        jVar.u(explanationText);
        String string2 = jVar.getResources().getString(py1.b.got_it_simple);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        jVar.q(string2);
        jVar.m("");
        return jVar;
    }

    public final boolean[] d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        List list = this.f92674a;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(a0.G0(context, (String) it.next())));
        }
        return CollectionsKt.A0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f92674a, nVar.f92674a) && Intrinsics.d(this.f92675b, nVar.f92675b) && Intrinsics.d(this.f92676c, nVar.f92676c);
    }

    public final int hashCode() {
        return Objects.hash(this.f92674a, this.f92675b, this.f92676c);
    }
}
