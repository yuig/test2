package t3;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class z4 {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f116292a = new LinkedHashMap();

    public static final do2.r2 a(Context context) {
        do2.r2 r2Var;
        LinkedHashMap linkedHashMap = f116292a;
        synchronized (linkedHashMap) {
            try {
                Object obj = linkedHashMap.get(context);
                if (obj == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    co2.m b13 = lb.l0.b(-1, null, 6);
                    obj = lb.l0.t1(new pb.k(new x4(contentResolver, uriFor, new y4(b13, bf.b.z(Looper.getMainLooper())), b13, context, null)), dl2.b.e(), new do2.q2(0L, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, obj);
                }
                r2Var = (do2.r2) obj;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return r2Var;
    }

    public static final i2.w b(View view) {
        Object tag = view.getTag(u2.s.androidx_compose_ui_view_composition_context);
        if (tag instanceof i2.w) {
            return (i2.w) tag;
        }
        return null;
    }
}
