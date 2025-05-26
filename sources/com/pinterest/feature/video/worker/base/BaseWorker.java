package com.pinterest.feature.video.worker.base;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import gi1.b;
import java.util.concurrent.CancellationException;
import kb.w;
import kb.x;
import kb.y;
import kb.z;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import pb0.a;
import pb0.g;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/video/worker/base/BaseWorker;", "Landroidx/work/Worker;", "", "cancelMessage", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "", "maxRetryAttempts", "<init>", "(Ljava/lang/String;Landroid/content/Context;Landroidx/work/WorkerParameters;I)V", "g4/u", "mediaWorkerLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class BaseWorker extends Worker {

    /* renamed from: e, reason: collision with root package name */
    public final String f49040e;

    /* renamed from: f, reason: collision with root package name */
    public final int f49041f;

    /* renamed from: g, reason: collision with root package name */
    public long f49042g;

    /* renamed from: h, reason: collision with root package name */
    public final v f49043h;

    /* renamed from: i, reason: collision with root package name */
    public final v f49044i;

    /* renamed from: j, reason: collision with root package name */
    public final v f49045j;

    public /* synthetic */ BaseWorker(String str, Context context, WorkerParameters workerParameters, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, context, workerParameters, (i14 & 8) != 0 ? 0 : i13);
    }

    @Override // androidx.work.Worker
    public final z i() {
        w wVar;
        try {
            j();
            ((g) ((a) this.f49044i.getValue())).getClass();
            this.f49042g = System.currentTimeMillis();
            p();
            return q();
        } catch (CancellationException e13) {
            m(e13);
            wVar = new w();
            Intrinsics.checkNotNullExpressionValue(wVar, "failure(...)");
            return wVar;
        } catch (Exception e14) {
            e14.printStackTrace();
            if (r(e14)) {
                o(e14);
                x xVar = new x();
                Intrinsics.checkNotNullExpressionValue(xVar, "retry(...)");
                return xVar;
            }
            n(e14);
            wVar = new w();
            Intrinsics.checkNotNullExpressionValue(wVar, "failure(...)");
            return wVar;
        }
    }

    public void j() {
        if (e()) {
            throw new CancellationException("checkWork() Stopped: " + this.f49040e);
        }
    }

    public final m60.w k() {
        Object value = this.f49043h.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m60.w) value;
    }

    public final d0 l() {
        Object value = this.f49045j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d0) value;
    }

    public abstract void m(CancellationException cancellationException);

    public abstract void n(Exception exc);

    public void o(Exception e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
    }

    public abstract void p();

    public y q() {
        y a13 = z.a();
        Intrinsics.checkNotNullExpressionValue(a13, "success(...)");
        return a13;
    }

    public boolean r(Exception e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        return this.f78963b.f20000d < this.f49041f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseWorker(@NotNull String cancelMessage, @NotNull Context context, @NotNull WorkerParameters workerParameters, int i13) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(cancelMessage, "cancelMessage");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        this.f49040e = cancelMessage;
        this.f49041f = i13;
        this.f49043h = m.b(b.f65154k);
        this.f49044i = m.b(b.f65156m);
        this.f49045j = m.b(b.f65155l);
    }
}
