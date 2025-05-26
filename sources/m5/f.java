package m5;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import g1.o0;
import g1.r;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kh2.a1;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final r f85851a = new r(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f85852b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f85853c;

    /* renamed from: d, reason: collision with root package name */
    public static final o0 f85854d;

    static {
        i iVar = new i();
        iVar.f85861a = "fonts-androidx";
        iVar.f85862b = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), iVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f85852b = threadPoolExecutor;
        f85853c = new Object();
        f85854d = new o0(0);
    }

    public static String a(int i13, List list) {
        StringBuilder sb3 = new StringBuilder();
        for (int i14 = 0; i14 < list.size(); i14++) {
            sb3.append(((c) list.get(i14)).f85843f);
            sb3.append("-");
            sb3.append(i13);
            if (i14 < list.size() - 1) {
                sb3.append(";");
            }
        }
        return sb3.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c7, code lost:
    
        throw r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057 A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #3 {all -> 0x001c, NameNotFoundException -> 0x00c8, all -> 0x00c3, all -> 0x0089, blocks: (B:3:0x000b, B:5:0x0013, B:10:0x001f, B:11:0x0023, B:16:0x0057, B:19:0x0060, B:21:0x006a, B:23:0x0070, B:26:0x0085, B:28:0x00ae, B:31:0x00ba, B:36:0x008a, B:37:0x008d, B:38:0x008e, B:41:0x00a9, B:44:0x00c4, B:45:0x00c7, B:47:0x0030, B:49:0x003c, B:52:0x0040, B:54:0x0044, B:56:0x004f, B:65:0x00c8, B:40:0x00a3, B:25:0x007f), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060 A[Catch: all -> 0x001c, TRY_ENTER, TryCatch #3 {all -> 0x001c, NameNotFoundException -> 0x00c8, all -> 0x00c3, all -> 0x0089, blocks: (B:3:0x000b, B:5:0x0013, B:10:0x001f, B:11:0x0023, B:16:0x0057, B:19:0x0060, B:21:0x006a, B:23:0x0070, B:26:0x0085, B:28:0x00ae, B:31:0x00ba, B:36:0x008a, B:37:0x008d, B:38:0x008e, B:41:0x00a9, B:44:0x00c4, B:45:0x00c7, B:47:0x0030, B:49:0x003c, B:52:0x0040, B:54:0x0044, B:56:0x004f, B:65:0x00c8, B:40:0x00a3, B:25:0x007f), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #3 {all -> 0x001c, NameNotFoundException -> 0x00c8, all -> 0x00c3, all -> 0x0089, blocks: (B:3:0x000b, B:5:0x0013, B:10:0x001f, B:11:0x0023, B:16:0x0057, B:19:0x0060, B:21:0x006a, B:23:0x0070, B:26:0x0085, B:28:0x00ae, B:31:0x00ba, B:36:0x008a, B:37:0x008d, B:38:0x008e, B:41:0x00a9, B:44:0x00c4, B:45:0x00c7, B:47:0x0030, B:49:0x003c, B:52:0x0040, B:54:0x0044, B:56:0x004f, B:65:0x00c8, B:40:0x00a3, B:25:0x007f), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ba A[Catch: all -> 0x001c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x001c, NameNotFoundException -> 0x00c8, all -> 0x00c3, all -> 0x0089, blocks: (B:3:0x000b, B:5:0x0013, B:10:0x001f, B:11:0x0023, B:16:0x0057, B:19:0x0060, B:21:0x006a, B:23:0x0070, B:26:0x0085, B:28:0x00ae, B:31:0x00ba, B:36:0x008a, B:37:0x008d, B:38:0x008e, B:41:0x00a9, B:44:0x00c4, B:45:0x00c7, B:47:0x0030, B:49:0x003c, B:52:0x0040, B:54:0x0044, B:56:0x004f, B:65:0x00c8, B:40:0x00a3, B:25:0x007f), top: B:2:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static m5.e b(java.lang.String r8, android.content.Context r9, java.util.List r10, int r11) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.f.b(java.lang.String, android.content.Context, java.util.List, int):m5.e");
    }

    public static Typeface c(Context context, List list, int i13, j jVar, sp2.i iVar) {
        String a13 = a(i13, list);
        Typeface typeface = (Typeface) f85851a.c(a13);
        int i14 = 1;
        if (typeface != null) {
            ((Executor) iVar.f114929c).execute(new s.f(iVar, (a1) iVar.f114928b, typeface, i14));
            return typeface;
        }
        l0.j jVar2 = new l0.j(iVar, 1);
        synchronized (f85853c) {
            try {
                o0 o0Var = f85854d;
                ArrayList arrayList = (ArrayList) o0Var.get(a13);
                if (arrayList != null) {
                    arrayList.add(jVar2);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(jVar2);
                o0Var.put(a13, arrayList2);
                d dVar = new d(a13, context, list, i13, 1);
                Executor executor = jVar;
                if (jVar == null) {
                    executor = f85852b;
                }
                executor.execute(new s.f(Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler(), dVar, new l0.j(a13, 2), 3));
                return null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
