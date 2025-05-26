package gp2;

import c0.o;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes4.dex */
public final class b extends ThreadPoolExecutor {

    /* renamed from: a, reason: collision with root package name */
    public static final int f65942a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f65943b;

    /* renamed from: c, reason: collision with root package name */
    public static final o f65944c;

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayBlockingQueue f65945d;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f65942a = Math.max(2, Math.min(availableProcessors - 1, 4));
        f65943b = (availableProcessors * 2) + 1;
        f65944c = new o(1);
        f65945d = new ArrayBlockingQueue(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void execute(java.lang.Runnable r11) {
        /*
            r10 = this;
            super.execute(r11)     // Catch: java.util.concurrent.RejectedExecutionException -> L4
            return
        L4:
            r11 = move-exception
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.concurrent.BlockingQueue r1 = r10.getQueue()
            r2 = 0
            java.lang.Runnable[] r3 = new java.lang.Runnable[r2]
            java.lang.Object[] r1 = r1.toArray(r3)
            java.lang.Runnable[] r1 = (java.lang.Runnable[]) r1
            int r3 = r1.length
            r4 = r2
        L19:
            if (r4 >= r3) goto L66
            r5 = r1[r4]
            java.lang.Class r6 = r5.getClass()
            r7 = 1
            java.lang.Class<gp2.a> r8 = gp2.a.class
            if (r6 == r8) goto L40
            java.lang.Class r8 = r6.getEnclosingClass()     // Catch: java.lang.Throwable -> L45
            java.lang.Class<android.os.AsyncTask> r9 = android.os.AsyncTask.class
            if (r8 != r9) goto L45
            java.lang.String r8 = "this$0"
            java.lang.reflect.Field r8 = r6.getDeclaredField(r8)     // Catch: java.lang.Throwable -> L45
            r8.setAccessible(r7)     // Catch: java.lang.Throwable -> L45
            java.lang.Object r5 = r8.get(r5)     // Catch: java.lang.Throwable -> L45
            java.lang.Class r6 = r5.getClass()     // Catch: java.lang.Throwable -> L45
            goto L45
        L40:
            d7.g.u(r5)     // Catch: java.lang.Throwable -> L45
            r5 = 0
            throw r5     // Catch: java.lang.Throwable -> L45
        L45:
            java.lang.String r5 = r6.getName()
            boolean r6 = r0.containsKey(r5)
            if (r6 == 0) goto L5a
            java.lang.Object r6 = r0.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            goto L5b
        L5a:
            r6 = r2
        L5b:
            int r6 = r6 + r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0.put(r5, r6)
            int r4 = r4 + 1
            goto L19
        L66:
            java.util.concurrent.RejectedExecutionException r1 = new java.util.concurrent.RejectedExecutionException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L75:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L9c
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getValue()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = 32
            if (r4 <= r5) goto L75
            java.lang.Object r3 = r3.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r2.append(r3)
            r2.append(r5)
            goto L75
        L9c:
            int r0 = r2.length()
            if (r0 != 0) goto La5
            java.lang.String r0 = "NO CLASSES FOUND"
            goto La9
        La5:
            java.lang.String r0 = r2.toString()
        La9:
            java.lang.String r2 = "Prominent classes in AsyncTask: "
            java.lang.String r0 = a.a.j(r2, r0)
            r1.<init>(r0, r11)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gp2.b.execute(java.lang.Runnable):void");
    }
}
