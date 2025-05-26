package h6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.bumptech.glide.integration.okhttp3.OkHttpGlideModule;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class q implements l {

    /* renamed from: a */
    public Context f67746a;

    public /* synthetic */ q(Context context) {
        this.f67746a = context;
    }

    public static OkHttpGlideModule f(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (newInstance instanceof OkHttpGlideModule) {
                    return (OkHttpGlideModule) newInstance;
                }
                throw new RuntimeException(a.a.i("Expected instanceof GlideModule, but found: ", newInstance));
            } catch (IllegalAccessException e13) {
                g(cls, e13);
                throw null;
            } catch (InstantiationException e14) {
                g(cls, e14);
                throw null;
            } catch (NoSuchMethodException e15) {
                g(cls, e15);
                throw null;
            } catch (InvocationTargetException e16) {
                g(cls, e16);
                throw null;
            }
        } catch (ClassNotFoundException e17) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e17);
        }
    }

    public static void g(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException(a.a.h("Unable to instantiate GlideModule implementation for ", cls), reflectiveOperationException);
    }

    @Override // h6.l
    public void a(com.bumptech.glide.d dVar) {
        int i13 = 0;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("EmojiCompatInitializer", i13));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new o(this, dVar, threadPoolExecutor, i13));
    }

    public lg.c b() {
        Context context = this.f67746a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        lg.c cVar = new lg.c();
        cVar.f83181a = ng.a.a(lg.f.f83189a);
        ng.c cVar2 = new ng.c(context);
        cVar.f83182b = cVar2;
        lg.g gVar = tg.b.f117570a;
        lg.g gVar2 = tg.b.f117571b;
        cVar.f83183c = ng.a.a(new mg.f(cVar2, new mg.d(cVar2, gVar, gVar2, 0)));
        ng.c cVar3 = cVar.f83182b;
        cVar.f83184d = new mg.d(cVar3, rg.e.f107940a, rg.e.f107941b, 1);
        wk2.a a13 = ng.a.a(new lg.l(gVar, gVar2, rg.e.f107942c, cVar.f83184d, ng.a.a(new pg.c(cVar3, 1)), 2));
        cVar.f83185e = a13;
        pg.c cVar4 = new pg.c(gVar, 0);
        ng.c cVar5 = cVar.f83182b;
        pg.d dVar = new pg.d(cVar5, a13, cVar4, gVar2, 0);
        wk2.a aVar = cVar.f83181a;
        wk2.a aVar2 = cVar.f83183c;
        cVar.f83186f = ng.a.a(new lg.l(gVar, gVar2, new lg.l(aVar, aVar2, dVar, a13, a13, 1), new qg.g(cVar5, aVar2, a13, dVar, aVar, a13, a13), new pg.d(aVar, a13, dVar, a13, 1), 0));
        return cVar;
    }

    public ApplicationInfo c(int i13, String str) {
        return this.f67746a.getPackageManager().getApplicationInfo(str, i13);
    }

    public PackageInfo d(int i13, String str) {
        return this.f67746a.getPackageManager().getPackageInfo(str, i13);
    }

    public boolean e() {
        if (Binder.getCallingUid() == Process.myUid()) {
            return ph.a.z0(this.f67746a);
        }
        String nameForUid = this.f67746a.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (nameForUid != null) {
            return this.f67746a.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }
}
