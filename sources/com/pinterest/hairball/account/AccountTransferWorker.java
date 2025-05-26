package com.pinterest.hairball.account;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import b60.d;
import ch.f;
import com.google.android.gms.internal.auth.zzax;
import com.google.android.gms.internal.auth.zzaz;
import com.google.android.gms.tasks.Tasks;
import java.nio.charset.Charset;
import java.util.Map;
import kb.w;
import kb.y;
import kb.z;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import lo1.b;
import lo1.c;
import m60.x0;
import nm.u;
import org.jetbrains.annotations.NotNull;
import se2.a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000b\fB+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/pinterest/hairball/account/AccountTransferWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lse2/a;", "Llo1/a;", "accountTransferUtil", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lse2/a;)V", "org/chromium/net/y", "lo1/b", "hairball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AccountTransferWorker extends Worker {

    /* renamed from: g, reason: collision with root package name */
    public static final Map f49721g;

    /* renamed from: e, reason: collision with root package name */
    public final Context f49722e;

    /* renamed from: f, reason: collision with root package name */
    public final a f49723f;

    static {
        b bVar = b.EXPORT;
        f49721g = z0.g(new Pair("com.google.android.gms.auth.START_ACCOUNT_EXPORT", bVar), new Pair("com.google.android.gms.auth.ACCOUNT_EXPORT_DATA_AVAILABLE", bVar), new Pair("com.google.android.gms.auth.ACCOUNT_IMPORT_DATA_AVAILABLE", b.IMPORT));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountTransferWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull a accountTransferUtil) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        Intrinsics.checkNotNullParameter(accountTransferUtil, "accountTransferUtil");
        this.f49722e = context;
        this.f49723f = accountTransferUtil;
    }

    @Override // androidx.work.Worker
    public final z i() {
        WorkerParameters workerParameters = this.f78963b;
        if (!workerParameters.f19998b.j("AccountTransferAction")) {
            w wVar = new w();
            Intrinsics.checkNotNullExpressionValue(wVar, "failure(...)");
            return wVar;
        }
        Object obj = workerParameters.f19998b.f().get("AccountTransferAction");
        if (obj == null) {
            w wVar2 = new w();
            Intrinsics.checkNotNullExpressionValue(wVar2, "failure(...)");
            return wVar2;
        }
        int i13 = c.f84167a[b.valueOf(String.valueOf(obj)).ordinal()];
        byte[] bArr = null;
        Context context = this.f49722e;
        a aVar = this.f49723f;
        if (i13 == 1) {
            lo1.a aVar2 = (lo1.a) ((bf2.b) aVar).get();
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            ch.b a13 = ch.a.a(context);
            Intrinsics.checkNotNullExpressionValue(a13, "getAccountTransferClient(...)");
            String string = context.getString(x0.new_account_transfer_account_type);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            vd0.c h10 = ((d) aVar2.f84165a).h();
            c60.a aVar3 = c60.d.f26516d;
            if (h10 != null && aVar3 != null) {
                u uVar = new u();
                uVar.u("version", "2");
                uVar.u("auth_token", aVar3.f26507a);
                uVar.u("v5_access_token", aVar3.f26508b);
                uVar.u("v5_refresh_token", aVar3.f26509c);
                uVar.r("user", h10.f125623a);
                String sVar = uVar.toString();
                Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
                Charset forName = Charset.forName("UTF-8");
                Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
                bArr = sVar.getBytes(forName);
                Intrinsics.checkNotNullExpressionValue(bArr, "getBytes(...)");
            }
            if (bArr == null) {
                a13.e(1, string);
            } else {
                try {
                    com.bumptech.glide.d.t(string);
                    Tasks.await(a13.d(1, new ch.d(new zzaz(string, bArr))), 10L, lo1.a.f84164c);
                    a13.e(1, string);
                } catch (Exception unused) {
                    a13.e(2, string);
                }
            }
        } else if (i13 == 2) {
            lo1.a aVar4 = (lo1.a) ((bf2.b) aVar).get();
            aVar4.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            ch.b a14 = ch.a.a(context);
            Intrinsics.checkNotNullExpressionValue(a14, "getAccountTransferClient(...)");
            String string2 = context.getString(x0.new_account_transfer_account_type);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            try {
                com.bumptech.glide.d.t(string2);
                byte[] bArr2 = (byte[]) Tasks.await(a14.d(0, new f(new zzax(string2))), 10L, lo1.a.f84164c);
                Intrinsics.f(bArr2);
                if (aVar4.a(bArr2)) {
                    a14.e(1, string2);
                } else {
                    aVar4.f84166b.b(null);
                    a14.e(1, string2);
                }
            } catch (Exception unused2) {
                a14.e(2, string2);
            }
        }
        y a15 = z.a();
        Intrinsics.checkNotNullExpressionValue(a15, "success(...)");
        return a15;
    }
}
