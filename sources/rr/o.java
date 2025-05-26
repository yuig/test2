package rr;

import android.net.Uri;
import com.pinterest.api.model.gw;
import com.pinterest.api.model.v7;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class o extends qr.d {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f109790j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, Uri uri, List segments, String str, gw modelHelper) {
        super(uri, segments, str, modelHelper, pVar.f109723a, pVar.f109810j);
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(modelHelper, "modelHelper");
        this.f109790j = pVar;
    }

    @Override // qr.d, uj2.d0
    /* renamed from: a */
    public final void onSuccess(v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        Uri uri = this.f104895a;
        String queryParameter = uri.getQueryParameter("from_news_id");
        String queryParameter2 = uri.getQueryParameter("ideas_referrer");
        String uid = board.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        NavigationImpl z03 = Navigation.z0((ScreenLocation) com.pinterest.screens.g1.f50813c.getValue(), uid);
        z03.m0("com.pinterest.EXTRA_BOARD_ID", uid);
        if (queryParameter != null && queryParameter.length() > 0) {
            z03.m0("com.pinterest.EXTRA_FROM_NEWSHUB_ID", queryParameter);
        }
        Integer intOrNull = queryParameter2 != null ? StringsKt.toIntOrNull(queryParameter2) : null;
        if (intOrNull != null) {
            z03.z(intOrNull.intValue(), "com.pinterest.EXTRA_IDEAS_REFERRER_TYPE");
            z03.Y1("com.pinterest.EXTRA_IS_MORE_IDEAS_FROM_HOME_FEED_REFERRER", kotlin.collections.c0.w(new int[]{x22.c.HF_STRUCTURED_FEED_STORY.value(), x22.c.HOME_FEED_STORY.value(), x22.c.HOME_FEED_SWIPE.value()}, intOrNull.intValue()));
        }
        String queryParameter3 = uri.getQueryParameter("request_params");
        if (queryParameter3 != null) {
            z03.m0("com.pinterest.STRUCTURED_FEED_REQUEST_PARAMS", queryParameter3);
        }
        p pVar = this.f109790j;
        pVar.f109723a.r(z03);
        pVar.f109723a.q();
    }
}
