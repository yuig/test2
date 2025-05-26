package dv1;

import b40.a0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final e f56396a;

    /* renamed from: b, reason: collision with root package name */
    public final String f56397b;

    /* renamed from: c, reason: collision with root package name */
    public final String f56398c;

    public f(bp1.c cVar, e eVar) {
        String str;
        String str2;
        this.f56396a = eVar;
        boolean z13 = cVar instanceof c;
        if (z13) {
            List list = ((a0) ((c) cVar).f56387b).f21684b;
            str = list != null ? (String) CollectionsKt.firstOrNull(list) : null;
            if (str == null) {
                str = "";
            }
        } else {
            if (!(cVar instanceof d)) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((d) cVar).f56388b.f41128a;
        }
        this.f56397b = str;
        if (z13) {
            str2 = ((a0) ((c) cVar).f56387b).f21685c;
        } else {
            if (!(cVar instanceof d)) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = ((d) cVar).f56388b.f41129b;
        }
        this.f56398c = str2;
        if (z13) {
            String str3 = ((a0) ((c) cVar).f56387b).f21686d;
        } else if (!(cVar instanceof d)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
