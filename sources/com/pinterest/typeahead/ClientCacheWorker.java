package com.pinterest.typeahead;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.pinterest.typeaheadroom.AppDatabase;
import e82.o;
import gp1.l;
import i1.a1;
import ir.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kb.y;
import kb.z;
import kk2.m;
import kotlin.Metadata;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import tb0.h;
import tk2.e;
import x92.c;
import y20.a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB5\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/pinterest/typeahead/ClientCacheWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Ly20/a;", "searchTypeaheadApi", "Lgp1/l;", "searchTypeaheadDownloadUtils", "Ltb0/h;", "crashReporting", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Ly20/a;Lgp1/l;Ltb0/h;)V", "bk/f", "serviceLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ClientCacheWorker extends Worker {

    /* renamed from: e, reason: collision with root package name */
    public final a f52196e;

    /* renamed from: f, reason: collision with root package name */
    public final l f52197f;

    /* renamed from: g, reason: collision with root package name */
    public final h f52198g;

    /* renamed from: h, reason: collision with root package name */
    public List f52199h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f52200i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientCacheWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull a searchTypeaheadApi, @NotNull l searchTypeaheadDownloadUtils, @NotNull h crashReporting) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        Intrinsics.checkNotNullParameter(searchTypeaheadApi, "searchTypeaheadApi");
        Intrinsics.checkNotNullParameter(searchTypeaheadDownloadUtils, "searchTypeaheadDownloadUtils");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f52196e = searchTypeaheadApi;
        this.f52197f = searchTypeaheadDownloadUtils;
        this.f52198g = crashReporting;
        this.f52199h = q0.f80391a;
        this.f52200i = System.currentTimeMillis() % ((long) 100) == 1;
    }

    @Override // androidx.work.Worker
    public final z i() {
        List split$default;
        l lVar = this.f52197f;
        lVar.getClass();
        ArrayList arrayList = new ArrayList();
        String d2 = lVar.f65940b.d("PREF_TYPEAHEAD_CACHE_PARTITIONS", null);
        if (d2 != null && d2.length() != 0) {
            split$default = StringsKt__StringsKt.split$default(d2, new String[]{","}, false, 0, 6, null);
            for (String str : (String[]) split$default.toArray(new String[0])) {
                arrayList.add(str);
            }
        }
        this.f52199h = arrayList;
        ((c) this.f52196e.f136682b).getClass();
        AppDatabase appDatabase = c.f134369b;
        if (appDatabase != null) {
            if (appDatabase == null) {
                Intrinsics.r("db");
                throw null;
            }
            appDatabase.t().s();
        }
        j(this.f52199h.iterator());
        y a13 = z.a();
        Intrinsics.checkNotNullExpressionValue(a13, "success(...)");
        return a13;
    }

    public final void j(Iterator it) {
        String path = (String) it.next();
        this.f52198g.h(a.a.j("Downloading: ", path));
        a aVar = this.f52196e;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(path, "path");
        m mVar = new m(aVar.f136681a.a(path).r(e.f118017c), new j(11, new u00.e(aVar, 2)), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        mVar.o(new o(2, new a1(this, path, it, 16)), new o(3, new e82.l(this, 1)));
    }
}
