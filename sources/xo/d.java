package xo;

import android.content.Context;
import com.pinterest.api.model.v7;
import h32.f1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import so.oa;

/* loaded from: classes3.dex */
public final class d implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135469a;

    /* renamed from: b, reason: collision with root package name */
    public final ap.o f135470b;

    /* renamed from: c, reason: collision with root package name */
    public final v7 f135471c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f135472d;

    public d(List emailIdList, List userIdList, ap.o uploadContactsUtil, v7 board, int i13) {
        this.f135469a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(emailIdList, "emailIdList");
            Intrinsics.checkNotNullParameter(userIdList, "userIdList");
            Intrinsics.checkNotNullParameter(uploadContactsUtil, "uploadContactsUtil");
            Intrinsics.checkNotNullParameter(board, "board");
            this.f135470b = uploadContactsUtil;
            this.f135471c = board;
            ArrayList H0 = CollectionsKt.H0(userIdList);
            H0.addAll(emailIdList);
            this.f135472d = H0;
            return;
        }
        Intrinsics.checkNotNullParameter(emailIdList, "emailIdList");
        Intrinsics.checkNotNullParameter(userIdList, "userIdList");
        Intrinsics.checkNotNullParameter(uploadContactsUtil, "uploadContactsUtil");
        Intrinsics.checkNotNullParameter(board, "board");
        this.f135470b = uploadContactsUtil;
        this.f135471c = board;
        ArrayList H02 = CollectionsKt.H0(userIdList);
        H02.addAll(emailIdList);
        this.f135472d = H02;
    }

    @Override // ak2.a
    public final void run() {
        ArrayList arrayList = this.f135472d;
        int i13 = this.f135469a;
        ap.o oVar = this.f135470b;
        v7 v7Var = this.f135471c;
        switch (i13) {
            case 0:
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    sh.f.a().a(f1.BOARD_INVITE_COLLABORATOR, (String) it.next(), false, true);
                }
                Context context = kb0.a.f79058b;
                ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().c(new up.c(v7Var, oVar));
                break;
            default:
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    sh.f.a().a(f1.BOARD_INVITE_COLLABORATOR, (String) it2.next(), false, true);
                }
                Context context2 = kb0.a.f79058b;
                ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().c(new up.c(v7Var, oVar));
                break;
        }
    }
}
