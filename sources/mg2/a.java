package mg2;

import android.content.SharedPreferences;
import io.embrace.android.embracesdk.internal.payload.UserInfo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.collections.s0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements b {

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f87149e;

    /* renamed from: f, reason: collision with root package name */
    public static final UserInfo f87150f;

    /* renamed from: a, reason: collision with root package name */
    public final uh2.b f87151a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f87152b;

    /* renamed from: c, reason: collision with root package name */
    public final nd2.a f87153c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f87154d;

    static {
        Pattern compile = Pattern.compile("^[a-zA-Z0-9_]{1,32}$");
        Intrinsics.checkNotNullExpressionValue(compile, "compile(\"^[a-zA-Z0-9_]{1,32}$\")");
        f87149e = compile;
        f87150f = new UserInfo("", "", "", s0.f80394a);
    }

    public a(uh2.b preferencesService, lh2.b logger) {
        Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f87151a = preferencesService;
        this.f87152b = new AtomicReference(f87150f);
        this.f87153c = new nd2.a(this, 17);
        this.f87154d = new CopyOnWriteArraySet();
    }

    public final void a() {
        Set set = f().f73279d;
        if (set == null || !set.isEmpty()) {
            HashSet hashSet = new HashSet();
            uh2.a aVar = (uh2.a) this.f87151a;
            if (aVar.f122252a.getBoolean("io.embrace.userispayer", false)) {
                hashSet.add("payer");
            }
            long j13 = aVar.f122252a.getLong("io.embrace.installtimestamp", -1L);
            Long valueOf = j13 == -1 ? null : Long.valueOf(j13);
            if (valueOf != null && aVar.f122253b.now() - valueOf.longValue() <= 86400000) {
                hashSet.add("first_day");
            }
            b(UserInfo.a(f(), null, null, null, hashSet, 7));
            SharedPreferences.Editor edit = aVar.f122252a.edit();
            edit.putStringSet("io.embrace.userpersonas", hashSet);
            edit.apply();
        }
    }

    public final void b(UserInfo userInfo) {
        synchronized (this.f87152b) {
            this.f87152b.set(userInfo);
            Unit unit = Unit.f80348a;
        }
        Iterator it = this.f87154d.iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).invoke();
        }
    }

    public final void c(String str) {
        String str2 = f().f73277b;
        if (str2 == null || !Intrinsics.d(str2, str)) {
            b(UserInfo.a(f(), null, str, null, null, 13));
            uh2.a.d(((uh2.a) this.f87151a).f122252a, "io.embrace.useremail", str);
        }
    }

    public final void d(String str) {
        String str2 = f().f73276a;
        if (str2 == null || !Intrinsics.d(str2, str)) {
            b(UserInfo.a(f(), str, null, null, null, 14));
            uh2.a.d(((uh2.a) this.f87151a).f122252a, "io.embrace.userid", str);
        }
    }

    public final void e(String str) {
        String str2 = f().f73278c;
        if (str2 == null || !Intrinsics.d(str2, str)) {
            b(UserInfo.a(f(), null, null, str, null, 11));
            uh2.a.d(((uh2.a) this.f87151a).f122252a, "io.embrace.username", str);
        }
    }

    public final UserInfo f() {
        Object obj = this.f87152b.get();
        UserInfo userInfo = f87150f;
        if (obj == userInfo) {
            synchronized (this.f87152b) {
                try {
                    if (this.f87152b.get() == userInfo) {
                        this.f87152b.set(this.f87153c.invoke());
                    }
                    Unit unit = Unit.f80348a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        Object obj2 = this.f87152b.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "userInfoReference.get()");
        return (UserInfo) obj2;
    }
}
