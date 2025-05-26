package dz;

import android.content.Context;
import android.os.Bundle;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.ScreenModel;
import il1.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jz.c;
import jz.d;
import jz.e;
import jz.f;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends jr.a {

    /* renamed from: n, reason: collision with root package name */
    public boolean f56648n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b screenFactory) {
        super(screenFactory);
        Intrinsics.checkNotNullParameter(screenFactory, "screenFactory");
        this.f56648n = true;
    }

    public final void H(Context context, List surveyPages, boolean z13) {
        ScreenModel screenModel;
        Intrinsics.checkNotNullParameter(surveyPages, "surveyPages");
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f56648n) {
            l();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = surveyPages.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            ScreenLocation a13 = lz.a.a(fVar);
            if (a13 != null) {
                Bundle bundle = new Bundle();
                if (fVar instanceof d) {
                    bundle.putString("questionId", ((d) fVar).f77739a);
                    bundle.putBoolean("isInline", z13);
                } else if (fVar instanceof e) {
                    bundle.putString("startMessage", ((e) fVar).f77744a);
                } else if (fVar instanceof c) {
                    bundle.putString("finalMessage", ((c) fVar).f77737a.a(context).toString());
                }
                screenModel = jr.a.o(a13, bundle);
            } else {
                screenModel = null;
            }
            if (screenModel != null) {
                arrayList.add(screenModel);
            }
        }
        k(arrayList);
    }
}
