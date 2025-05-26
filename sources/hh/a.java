package hh;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.appcompat.app.z;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import g1.o0;
import io.jsonwebtoken.JwsHeader;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    public static int f69091h;

    /* renamed from: i, reason: collision with root package name */
    public static PendingIntent f69092i;

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f69093j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b, reason: collision with root package name */
    public final Context f69095b;

    /* renamed from: c, reason: collision with root package name */
    public final j6.b f69096c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f69097d;

    /* renamed from: f, reason: collision with root package name */
    public Messenger f69099f;

    /* renamed from: g, reason: collision with root package name */
    public zzd f69100g;

    /* renamed from: a, reason: collision with root package name */
    public final o0 f69094a = new o0(0);

    /* renamed from: e, reason: collision with root package name */
    public final Messenger f69098e = new Messenger(new b(this, Looper.getMainLooper()));

    public a(Context context) {
        this.f69095b = context;
        this.f69096c = new j6.b(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f69097d = scheduledThreadPoolExecutor;
    }

    public final Task a(Bundle bundle) {
        final String num;
        synchronized (a.class) {
            int i13 = f69091h;
            f69091h = i13 + 1;
            num = Integer.toString(i13);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.f69094a) {
            this.f69094a.put(num, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f69096c.e() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.f69095b;
        synchronized (a.class) {
            try {
                if (f69092i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f69092i = ci.a.a(context, intent2, ci.a.f27755a);
                }
                intent.putExtra("app", f69092i);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(num).length() + 5);
        sb3.append("|ID|");
        sb3.append(num);
        sb3.append("|");
        intent.putExtra(JwsHeader.KEY_ID, sb3.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb4 = new StringBuilder(valueOf.length() + 8);
            sb4.append("Sending ");
            sb4.append(valueOf);
            Log.d("Rpc", sb4.toString());
        }
        intent.putExtra("google.messenger", this.f69098e);
        if (this.f69099f != null || this.f69100g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f69099f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f69100g.a(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            final ScheduledFuture<?> schedule = this.f69097d.schedule(new z(taskCompletionSource, 24), 30L, TimeUnit.SECONDS);
            taskCompletionSource.getTask().addOnCompleteListener(o.f69132a, new OnCompleteListener() { // from class: hh.m
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    a aVar = a.this;
                    String str = num;
                    ScheduledFuture scheduledFuture = schedule;
                    synchronized (aVar.f69094a) {
                        aVar.f69094a.remove(str);
                    }
                    scheduledFuture.cancel(false);
                }
            });
            return taskCompletionSource.getTask();
        }
        if (this.f69096c.e() == 2) {
            this.f69095b.sendBroadcast(intent);
        } else {
            this.f69095b.startService(intent);
        }
        final ScheduledFuture schedule2 = this.f69097d.schedule(new z(taskCompletionSource, 24), 30L, TimeUnit.SECONDS);
        taskCompletionSource.getTask().addOnCompleteListener(o.f69132a, new OnCompleteListener() { // from class: hh.m
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                a aVar = a.this;
                String str = num;
                ScheduledFuture scheduledFuture = schedule2;
                synchronized (aVar.f69094a) {
                    aVar.f69094a.remove(str);
                }
                scheduledFuture.cancel(false);
            }
        });
        return taskCompletionSource.getTask();
    }

    public final void b(String str, Bundle bundle) {
        synchronized (this.f69094a) {
            try {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f69094a.remove(str);
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(bundle);
                } else {
                    String valueOf = String.valueOf(str);
                    Log.w("Rpc", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
