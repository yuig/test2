package ja;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f75216a;

    /* renamed from: b, reason: collision with root package name */
    public final String f75217b;

    /* renamed from: c, reason: collision with root package name */
    public final oa.e f75218c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f75219d;

    /* renamed from: e, reason: collision with root package name */
    public final List f75220e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f75221f;

    /* renamed from: g, reason: collision with root package name */
    public final b0 f75222g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f75223h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f75224i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f75225j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f75226k;

    /* renamed from: l, reason: collision with root package name */
    public final Set f75227l;

    /* renamed from: m, reason: collision with root package name */
    public final List f75228m;

    /* renamed from: n, reason: collision with root package name */
    public final List f75229n;

    public g(Context context, String str, oa.e sqliteOpenHelperFactory, c0 migrationContainer, ArrayList arrayList, boolean z13, b0 journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z14, boolean z15, LinkedHashSet linkedHashSet, ArrayList typeConverters, ArrayList autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        this.f75216a = context;
        this.f75217b = str;
        this.f75218c = sqliteOpenHelperFactory;
        this.f75219d = migrationContainer;
        this.f75220e = arrayList;
        this.f75221f = z13;
        this.f75222g = journalMode;
        this.f75223h = queryExecutor;
        this.f75224i = transactionExecutor;
        this.f75225j = z14;
        this.f75226k = z15;
        this.f75227l = linkedHashSet;
        this.f75228m = typeConverters;
        this.f75229n = autoMigrationSpecs;
    }

    public final boolean a(int i13, int i14) {
        if ((i13 > i14 && this.f75226k) || !this.f75225j) {
            return false;
        }
        Set set = this.f75227l;
        return set == null || !set.contains(Integer.valueOf(i13));
    }
}
