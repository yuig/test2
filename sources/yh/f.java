package yh;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.appcompat.app.v;
import androidx.appcompat.widget.j;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class f implements ah.a {

    /* renamed from: c, reason: collision with root package name */
    public static f f139040c;

    /* renamed from: a, reason: collision with root package name */
    public final Context f139041a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f139042b;

    public f(Context context) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f139042b = Executors.newSingleThreadExecutor();
        this.f139041a = context;
        newSingleThreadScheduledExecutor.scheduleAtFixedRate(new v(this), 0L, 86400L, TimeUnit.SECONDS);
    }

    public static final SharedPreferences b(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void c(Context context) {
        if (b(context).edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String valueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(valueOf) : new String("Failed to store app set ID last used time for App "));
        throw new e("Failed to store the app set ID last used time.");
    }

    @Override // ah.a
    public final Task a() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f139042b.execute(new j(this, taskCompletionSource, 19));
        return taskCompletionSource.getTask();
    }
}
