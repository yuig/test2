package com.pinterest.account;

import android.content.Context;
import android.content.Intent;
import bk.f;
import com.pinterest.hairball.account.AccountTransferWorker;
import java.util.LinkedHashMap;
import java.util.Map;
import kb.e0;
import kb.f0;
import kb.l;
import kb.u0;
import kb.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lo1.b;
import ly1.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/account/AccountTransferBroadcastReceiver;", "Lly1/a;", "<init>", "()V", "hairball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AccountTransferBroadcastReceiver extends a {
    @Override // ly1.a, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        f0 f0Var;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onReceive(context, intent);
        String action = intent.getAction();
        if (action != null) {
            Map map = AccountTransferWorker.f49721g;
            Intrinsics.checkNotNullParameter(action, "action");
            b action2 = (b) AccountTransferWorker.f49721g.get(action);
            if (action2 != null) {
                Intrinsics.checkNotNullParameter(action2, "action");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String name = action2.name();
                Intrinsics.checkNotNullParameter("AccountTransferAction", "key");
                linkedHashMap.put("AccountTransferAction", name);
                l lVar = new l(linkedHashMap);
                f.e0(lVar);
                Intrinsics.checkNotNullParameter(AccountTransferWorker.class, "workerClass");
                f0Var = (f0) ((e0) new e0(AccountTransferWorker.class).h(lVar)).b();
            } else {
                f0Var = null;
            }
            if (f0Var != null) {
                u0 u0Var = w0.f79048a;
                Context context2 = kb0.a.f79058b;
                u0Var.a(m60.f0.j0()).d(f0Var);
            }
        }
    }
}
