package so;

import android.adservices.measurement.MeasurementManager;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.webkit.CookieManager;
import com.google.android.gms.ads.AdSize;
import com.google.gson.reflect.TypeToken;
import com.pinterest.activity.library.modal.PostSaveUpsellModalViewProviderImpl;
import com.pinterest.api.model.AggregatedCommentFeed;
import com.pinterest.api.model.BoardSectionFeed;
import com.pinterest.api.model.ContactRequestFeed;
import com.pinterest.api.model.ConversationFeed;
import com.pinterest.api.model.DynamicFeed;
import com.pinterest.api.model.PinFeed;
import com.pinterest.api.model.UserDidItDataFeed;
import com.pinterest.api.model.az0;
import com.pinterest.api.model.cm0;
import com.pinterest.api.model.deserializer.AggregatedCommentDeserializer;
import com.pinterest.api.model.deserializer.BoardDeserializer;
import com.pinterest.api.model.deserializer.BoardInviteDeserializer;
import com.pinterest.api.model.deserializer.BoardMoreIdeasCardsCarouselDeserializer;
import com.pinterest.api.model.deserializer.BoardMoreIdeasFeedUpsellDeserializer;
import com.pinterest.api.model.deserializer.BoardNoteDeserializer;
import com.pinterest.api.model.deserializer.BoardNoteListDeserializer;
import com.pinterest.api.model.deserializer.BoardNotePinCollectionDeserializer;
import com.pinterest.api.model.deserializer.BoardSectionDeserializer;
import com.pinterest.api.model.deserializer.BoardSectionNameRecommendationDeserializer;
import com.pinterest.api.model.deserializer.BoardToolDeserializerAdapter;
import com.pinterest.api.model.deserializer.BubbleSeparatorDeserializer;
import com.pinterest.api.model.deserializer.CollaboratorInviteDeserializer;
import com.pinterest.api.model.deserializer.CommentStickerDeserializer;
import com.pinterest.api.model.deserializer.ContextualSearchObjectDeserializer;
import com.pinterest.api.model.deserializer.ConversationContactRequestDeserializer;
import com.pinterest.api.model.deserializer.ConversationDeserializer;
import com.pinterest.api.model.deserializer.ConversationMessageDeserializer;
import com.pinterest.api.model.deserializer.CreatorRecommendationItemDeserializer;
import com.pinterest.api.model.deserializer.DynamicStoryDeserializer;
import com.pinterest.api.model.deserializer.ExploreArticleDeserializer;
import com.pinterest.api.model.deserializer.ExploreSearchObjectDeserializer;
import com.pinterest.api.model.deserializer.FeedSectionTitleDeserializer;
import com.pinterest.api.model.deserializer.GenericModelDeserializer;
import com.pinterest.api.model.deserializer.HomeFeedTabsDeserializer;
import com.pinterest.api.model.deserializer.IdeaPinInteractiveStickerDeserializer;
import com.pinterest.api.model.deserializer.IdeaPinMusicArtistDeserializer;
import com.pinterest.api.model.deserializer.IdeaPinMusicMetadataDeserializer;
import com.pinterest.api.model.deserializer.IdeaPinMusicTagDeserializer;
import com.pinterest.api.model.deserializer.IdeaPinStickerCategoryDeserializer;
import com.pinterest.api.model.deserializer.IdeaPinStickerDeserializer;
import com.pinterest.api.model.deserializer.IdeasCardDeserializer;
import com.pinterest.api.model.deserializer.IdeasCardFeedMetadataDeserializer;
import com.pinterest.api.model.deserializer.LensHistoryObjectDeserializer;
import com.pinterest.api.model.deserializer.NestedBoardSectionNameRecommendationDeserializer;
import com.pinterest.api.model.deserializer.NewsHubItemDeserializer;
import com.pinterest.api.model.deserializer.OnebarmoduleDeserializer;
import com.pinterest.api.model.deserializer.PearInsightDeserializer;
import com.pinterest.api.model.deserializer.PearQuizDeserializer;
import com.pinterest.api.model.deserializer.PearQuizOutputDeserializer;
import com.pinterest.api.model.deserializer.PearTopicDeserializer;
import com.pinterest.api.model.deserializer.PinClusterDeserializer;
import com.pinterest.api.model.deserializer.PinDeserializer;
import com.pinterest.api.model.deserializer.ProductGroupDeserializer;
import com.pinterest.api.model.deserializer.RelatedFilterTabDeserializer;
import com.pinterest.api.model.deserializer.ScheduledPinDeserializer;
import com.pinterest.api.model.deserializer.SearchFeedTabsDeserializer;
import com.pinterest.api.model.deserializer.SearchFilterModifierEligibilityDeserializer;
import com.pinterest.api.model.deserializer.ShuffleAssetDeserializer;
import com.pinterest.api.model.deserializer.ShuffleDeserializer;
import com.pinterest.api.model.deserializer.StoryDeserializer;
import com.pinterest.api.model.deserializer.TaxonomyDeserializer;
import com.pinterest.api.model.deserializer.TodayArticleDeserializer;
import com.pinterest.api.model.deserializer.TrackedCommentDeserializer;
import com.pinterest.api.model.deserializer.TrendingHashtagDeserializer;
import com.pinterest.api.model.deserializer.UnifiedCommentsPreviewDeserializer;
import com.pinterest.api.model.deserializer.UsecaseDeserializer;
import com.pinterest.api.model.deserializer.UserDeserializer;
import com.pinterest.api.model.deserializer.UserDidItDataDeserializer;
import com.pinterest.api.model.deserializer.UserReactionDeserializer;
import com.pinterest.api.model.et;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fr0;
import com.pinterest.api.model.fz0;
import com.pinterest.api.model.gw;
import com.pinterest.api.model.mv;
import com.pinterest.api.model.my0;
import com.pinterest.api.model.o50;
import com.pinterest.api.model.q40;
import com.pinterest.api.model.qh;
import com.pinterest.api.model.qx;
import com.pinterest.api.model.s40;
import com.pinterest.api.model.t50;
import com.pinterest.api.model.ue;
import com.pinterest.api.model.ve;
import com.pinterest.api.model.vv;
import com.pinterest.api.model.w01;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.x50;
import com.pinterest.api.model.xe;
import com.pinterest.api.model.xs0;
import com.pinterest.api.model.yc0;
import com.pinterest.api.model.ye;
import com.pinterest.api.model.z10;
import com.pinterest.database.PinterestDatabase;
import com.pinterest.deserializers.ModelDeserializerWithSave;
import com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge;
import com.pinterest.education.event.BoardCreateOrPickerNavigationProviderImpl;
import com.pinterest.engage.GoogleEngageBroadcastReceiver;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.newshub.model.NewsHubItemFeed;
import com.pinterest.feature.search.typeahead.SearchTypeAheadProvidersImpl;
import com.pinterest.feature.search.visual.collage.database.CollageDatabase;
import com.pinterest.handshake.model.HandshakeApiClientService;
import com.pinterest.handshake.model.HandshakeRemoteRemoteDataSource;
import com.pinterest.handshake.model.IHandshakeRemoteDataSource;
import com.pinterest.repository.interest.HierarchicalInterestDeserializableAdapter;
import com.pinterest.repository.interest.HierarchicalInterestDeserializer;
import com.pinterest.repository.interest.InterestDeserializer;
import com.pinterest.repository.pin.PinService;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import net.quikkly.android.utils.BitmapUtils;
import okhttp3.Authenticator;
import okhttp3.CookieJar;
import okhttp3.EventListener;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/* loaded from: classes.dex */
public final class na implements bf2.d {

    /* renamed from: a, reason: collision with root package name */
    public final oa f113568a;

    /* renamed from: b, reason: collision with root package name */
    public final int f113569b;

    public na(oa oaVar, int i13) {
        this.f113568a = oaVar;
        this.f113569b = i13;
    }

    public final Object a() {
        na naVar;
        bf2.d dVar;
        bf2.d dVar2;
        bf2.d dVar3;
        na naVar2;
        bf2.d dVar4;
        bf2.d dVar5;
        na naVar3;
        na naVar4;
        na naVar5;
        bf2.d dVar6;
        na naVar6;
        h6.q qVar;
        bf2.d dVar7;
        bf2.d dVar8;
        na naVar7;
        bf2.d dVar9;
        rq2.a J2;
        bf2.d dVar10;
        bf2.d dVar11;
        na naVar8;
        bf2.d dVar12;
        bf2.d dVar13;
        bf2.d dVar14;
        na naVar9;
        bf2.a aVar;
        na naVar10;
        bf2.d dVar15;
        bf2.d dVar16;
        bf2.d dVar17;
        bf2.d dVar18;
        bf2.d dVar19;
        na naVar11;
        bf2.d dVar20;
        rq2.a J22;
        na naVar12;
        na naVar13;
        na naVar14;
        bf2.d dVar21;
        bf2.d dVar22;
        bf2.d dVar23;
        na naVar15;
        na naVar16;
        bf2.d dVar24;
        bf2.d dVar25;
        bf2.d dVar26;
        bf2.d dVar27;
        h6.q qVar2;
        na naVar17;
        na naVar18;
        na naVar19;
        na naVar20;
        na naVar21;
        h6.q qVar3;
        na naVar22;
        bf2.d dVar28;
        na naVar23;
        na naVar24;
        na naVar25;
        h6.q qVar4;
        bf2.d dVar29;
        bf2.d dVar30;
        bf2.d dVar31;
        bf2.d dVar32;
        na naVar26;
        bf2.a aVar2;
        na naVar27;
        bf2.d dVar33;
        na naVar28;
        na naVar29;
        na naVar30;
        bf2.a aVar3;
        h6.q qVar5;
        bf2.d dVar34;
        h6.q qVar6;
        bf2.d dVar35;
        bf2.d dVar36;
        vy.o oVar;
        vy.p pVar;
        switch (this.f113569b) {
            case 0:
                lb0.o oVar2 = (lb0.o) this.f113568a.f113780l0.get();
                naVar = this.f113568a.f113797m0;
                return com.pinterest.widget.configuration.k.d(oVar2, (tb0.h) naVar.get(), (nm.o) this.f113568a.f113833o0.get());
            case 1:
                return com.pinterest.widget.configuration.k.i0();
            case 2:
                return a02.e.f2();
            case 3:
                dVar = this.f113568a.f113815n0;
                return com.pinterest.widget.configuration.k.s0((nm.p) dVar.get());
            case 4:
                return com.pinterest.widget.configuration.k.t0(oa.K0(this.f113568a), oa.u1(this.f113568a), oa.v1(this.f113568a), oa.J1(this.f113568a));
            case 5:
                return a02.e.N4(this.f113568a.f113585a);
            case 6:
                return a02.e.m2();
            case 7:
                nx.e0 e0Var = (nx.e0) this.f113568a.T1.get();
                dVar2 = this.f113568a.f113730i2;
                nx.d1 d1Var = (nx.d1) dVar2.get();
                dVar3 = this.f113568a.f113920t0;
                m60.e eVar = (m60.e) dVar3.get();
                naVar2 = this.f113568a.f113797m0;
                tb0.h hVar = (tb0.h) naVar2.get();
                vy.m mVar = (vy.m) this.f113568a.M1.get();
                gw a13 = l10.b.a();
                vb0.c o03 = com.pinterest.widget.configuration.k.o0();
                dVar4 = this.f113568a.f113850p0;
                return new nx.m(e0Var, d1Var, eVar, hVar, mVar, a13, o03, (b60.b) dVar4.get(), (gz1.b) this.f113568a.C1.get());
            case 8:
                return com.pinterest.widget.configuration.k.n2(oa.j0(this.f113568a));
            case 9:
                g4.b H0 = oa.H0(this.f113568a);
                dVar5 = this.f113568a.f113920t0;
                m60.e eVar2 = (m60.e) dVar5.get();
                lb0.g gVar = (lb0.g) this.f113568a.f113938u0.get();
                naVar3 = this.f113568a.f113712h2;
                oa oaVar = this.f113568a;
                na naVar31 = oaVar.f114010y0;
                naVar4 = oaVar.f113885r0;
                m60.w wVar = (m60.w) naVar4.get();
                naVar5 = this.f113568a.f113797m0;
                tb0.h hVar2 = (tb0.h) naVar5.get();
                dVar6 = this.f113568a.f113921t1;
                return com.pinterest.widget.configuration.k.F(H0, eVar2, gVar, naVar3, naVar31, wVar, hVar2, (i92.k) dVar6.get());
            case 10:
                naVar6 = this.f113568a.f113902s0;
                return a02.e.C1((at1.d) naVar6.get());
            case 11:
                qVar = this.f113568a.f113603b;
                return a02.e.N2(com.pinterest.widget.configuration.k.h(qVar));
            case 12:
                com.pinterest.widget.configuration.k.C();
                return lb0.f.f82707a;
            case 13:
                dVar7 = this.f113568a.f113676f2;
                oh0.h hVar3 = (oh0.h) dVar7.get();
                dVar8 = this.f113568a.f113694g2;
                return new oh0.g(hVar3, (oh0.h) dVar8.get(), com.pinterest.widget.configuration.k.E());
            case 14:
                naVar7 = this.f113568a.f113623c2;
                pq2.c1 c1Var = (pq2.c1) naVar7.get();
                p00.b m13 = oa.m1(this.f113568a);
                dVar9 = this.f113568a.f114011y1;
                rz.c cVar = (rz.c) dVar9.get();
                J2 = this.f113568a.J2();
                return a02.e.n2(cVar, m13, c1Var, J2);
            case 15:
                return com.pinterest.widget.configuration.k.n((pq2.d1) this.f113568a.f113816n1.get());
            case 16:
                return com.pinterest.widget.configuration.k.m((lh0.d3) this.f113568a.f113993x1.get(), (vu1.a0) this.f113568a.f113798m1.get(), this.f113568a.Y2(), (OkHttpClient) this.f113568a.f113956v0.get());
            case 17:
                OkHttpClient okHttpClient = (OkHttpClient) this.f113568a.f114029z1.get();
                dVar10 = this.f113568a.f113606b2;
                return com.pinterest.widget.configuration.k.l(okHttpClient, (Authenticator) dVar10.get(), oa.n0(this.f113568a));
            case 18:
                OkHttpClient okHttpClient2 = (OkHttpClient) this.f113568a.f113974w0.get();
                cy.k kVar = (cy.k) this.f113568a.S0.get();
                z10.c z03 = oa.z0(this.f113568a);
                dVar11 = this.f113568a.S1;
                su1.b bVar = (su1.b) dVar11.get();
                z10.j M1 = oa.M1(this.f113568a);
                naVar8 = this.f113568a.U1;
                HttpLoggingInterceptor httpLoggingInterceptor = (HttpLoggingInterceptor) naVar8.get();
                dVar12 = this.f113568a.f113920t0;
                m60.e eVar3 = (m60.e) dVar12.get();
                dVar13 = this.f113568a.W1;
                CookieJar cookieJar = (CookieJar) dVar13.get();
                su1.i iVar = (su1.i) this.f113568a.f113781l1.get();
                dVar14 = this.f113568a.Y1;
                return s00.b.a(okHttpClient2, kVar, z03, bVar, M1, httpLoggingInterceptor, eVar3, cookieJar, iVar, (EventListener.Factory) dVar14.get(), this.f113568a.d3(), oa.D1(this.f113568a), (lh0.d3) this.f113568a.f113993x1.get());
            case 19:
                naVar9 = this.f113568a.f113902s0;
                Context context = (Context) naVar9.get();
                aVar = this.f113568a.O0;
                lb0.q qVar7 = (lb0.q) aVar.get();
                tu1.g0 g0Var = (tu1.g0) this.f113568a.N0.get();
                naVar10 = this.f113568a.E0;
                return com.pinterest.widget.configuration.k.q0(context, qVar7, g0Var, (lh0.n1) naVar10.get());
            case 20:
                return new lb0.q(bf2.b.a(this.f113568a.f113587a1), (ao2.j0) this.f113568a.G0.get(), bf2.b.a(this.f113568a.N1), bf2.b.a(this.f113568a.f114010y0), oa.B1(this.f113568a));
            case 21:
                dVar15 = this.f113568a.f113850p0;
                return new nb0.d((b60.a) dVar15.get(), (ox.b) this.f113568a.M1.get());
            case 22:
                vy.o oVar3 = (vy.o) this.f113568a.F1.get();
                dVar16 = this.f113568a.I1;
                vy.o oVar4 = (vy.o) dVar16.get();
                dVar17 = this.f113568a.K1;
                vy.p pVar2 = (vy.p) dVar17.get();
                dVar18 = this.f113568a.L1;
                vy.p pVar3 = (vy.p) dVar18.get();
                m60.f0 f0Var = new m60.f0();
                dVar19 = this.f113568a.f113920t0;
                m60.e eVar4 = (m60.e) dVar19.get();
                naVar11 = this.f113568a.f113797m0;
                return com.pinterest.widget.configuration.k.f(oVar3, oVar4, pVar2, pVar3, f0Var, eVar4, (tb0.h) naVar11.get());
            case 23:
                OkHttpClient okHttpClient3 = (OkHttpClient) this.f113568a.f113956v0.get();
                vu1.a0 a0Var = (vu1.a0) this.f113568a.f113798m1.get();
                pq2.d1 d1Var2 = (pq2.d1) this.f113568a.f113816n1.get();
                z10.h s13 = oa.s1(this.f113568a);
                p00.b k13 = oa.k1(this.f113568a);
                dVar20 = this.f113568a.f114011y1;
                rz.c cVar2 = (rz.c) dVar20.get();
                J22 = this.f113568a.J2();
                String i03 = oa.i0(this.f113568a);
                naVar12 = this.f113568a.E0;
                return a02.e.E1(okHttpClient3, a0Var, d1Var2, s13, k13, cVar2, J22, i03, (lh0.n1) naVar12.get(), new z10.e(), (vu1.a0) this.f113568a.E1.get(), new z10.f());
            case 24:
                return com.pinterest.widget.configuration.k.k((vu1.a0) this.f113568a.U0.get(), (OkHttpClient) this.f113568a.f113956v0.get());
            case 25:
                OkHttpClient okHttpClient4 = (OkHttpClient) this.f113568a.f113974w0.get();
                tu1.g0 g0Var2 = (tu1.g0) this.f113568a.N0.get();
                tu1.d0 d0Var = (tu1.d0) this.f113568a.f113711h1.get();
                naVar13 = this.f113568a.f113797m0;
                tb0.h hVar4 = (tb0.h) naVar13.get();
                xk2.k kVar2 = (xk2.k) this.f113568a.f113746j1.get();
                su1.i iVar2 = (su1.i) this.f113568a.f113781l1.get();
                List list = (List) this.f113568a.K0.get();
                naVar14 = this.f113568a.E0;
                return com.pinterest.widget.configuration.k.p(okHttpClient4, g0Var2, d0Var, hVar4, kVar2, iVar2, list, (lh0.n1) naVar14.get());
            case 26:
                dVar21 = this.f113568a.C0;
                tu1.l0 l0Var = (tu1.l0) dVar21.get();
                dVar22 = this.f113568a.L0;
                se2.a a14 = bf2.b.a(dVar22);
                dVar23 = this.f113568a.M0;
                se2.a a15 = bf2.b.a(dVar23);
                naVar15 = this.f113568a.E0;
                return com.pinterest.widget.configuration.k.D(l0Var, a14, a15, (lh0.n1) naVar15.get());
            case 27:
                tu1.j0 j0Var = new tu1.j0((Context) this.f113568a.f113902s0.get());
                naVar16 = this.f113568a.f113797m0;
                tb0.h hVar5 = (tb0.h) naVar16.get();
                dVar24 = this.f113568a.B0;
                return new tu1.l0(j0Var, hVar5, (tu1.v) dVar24.get());
            case 28:
                dVar25 = this.f113568a.A0;
                tu1.v vVar = (tu1.v) dVar25.get();
                com.pinterest.widget.configuration.k.z(vVar);
                return vVar;
            case 29:
                dVar26 = this.f113568a.f113992x0;
                tu1.w wVar2 = (tu1.w) dVar26.get();
                dVar27 = this.f113568a.f114028z0;
                return new tu1.v(wVar2, (tu1.x) dVar27.get());
            case 30:
                qVar2 = this.f113568a.f113603b;
                Context context2 = qVar2.f67746a;
                dl2.b.I(context2);
                return com.pinterest.widget.configuration.k.B(context2);
            case 31:
                return new tu1.x((lb0.o) this.f113568a.f114010y0.get());
            case 32:
                return com.pinterest.widget.configuration.k.T();
            case 33:
                tu1.j0 j0Var2 = new tu1.j0((Context) this.f113568a.f113902s0.get());
                tu1.i0 W0 = oa.W0(this.f113568a);
                tu1.h0 V0 = oa.V0(this.f113568a);
                uu1.b bVar2 = (uu1.b) this.f113568a.F0.get();
                List list2 = (List) this.f113568a.K0.get();
                naVar17 = this.f113568a.f113797m0;
                tb0.h hVar6 = (tb0.h) naVar17.get();
                naVar18 = this.f113568a.E0;
                return a02.e.x2(j0Var2, W0, V0, bVar2, list2, hVar6, (lh0.n1) naVar18.get());
            case 34:
                return new lh0.n1((lh0.z0) this.f113568a.D0.get());
            case 35:
                return com.pinterest.widget.configuration.k.Q();
            case 36:
                tu1.y E0 = oa.E0(this.f113568a);
                naVar19 = this.f113568a.E0;
                return com.pinterest.widget.configuration.k.Z(E0, (lh0.n1) naVar19.get());
            case 37:
                return new cy.a((xu1.y) this.f113568a.I0.get(), oa.r1(this.f113568a), this.f113568a.d3());
            case 38:
                naVar20 = this.f113568a.f113902s0;
                return com.pinterest.widget.configuration.k.R((Context) naVar20.get(), (ao2.j0) this.f113568a.G0.get(), (androidx.lifecycle.z) this.f113568a.H0.get(), oa.G0(this.f113568a));
            case 39:
                return com.pinterest.widget.configuration.k.i();
            case 40:
                return com.pinterest.widget.configuration.k.X();
            case 41:
                tu1.i0 W02 = oa.W0(this.f113568a);
                naVar21 = this.f113568a.f113797m0;
                tb0.h hVar7 = (tb0.h) naVar21.get();
                qVar3 = this.f113568a.f113603b;
                Context context3 = qVar3.f67746a;
                dl2.b.I(context3);
                naVar22 = this.f113568a.E0;
                return com.pinterest.widget.configuration.k.I(W02, hVar7, context3, (lh0.n1) naVar22.get());
            case 42:
                uu1.b bVar3 = (uu1.b) this.f113568a.F0.get();
                dVar28 = this.f113568a.f113693g1;
                tu1.o0 o0Var = (tu1.o0) dVar28.get();
                naVar23 = this.f113568a.E0;
                return a02.e.h2(bVar3, o0Var, (lh0.n1) naVar23.get());
            case 43:
                dc2.e eVar5 = (dc2.e) this.f113568a.f113675f1.get();
                naVar24 = this.f113568a.f113797m0;
                tb0.h hVar8 = (tb0.h) naVar24.get();
                naVar25 = this.f113568a.E0;
                return com.pinterest.widget.configuration.k.A(eVar5, hVar8, (lh0.n1) naVar25.get());
            case 44:
                qVar4 = this.f113568a.f113603b;
                Context context4 = qVar4.f67746a;
                dl2.b.I(context4);
                oa oaVar2 = this.f113568a;
                bf2.d dVar37 = oaVar2.P0;
                dVar29 = oaVar2.X0;
                at1.d X0 = oa.X0(this.f113568a);
                dVar30 = this.f113568a.f113850p0;
                b60.a aVar4 = (b60.a) dVar30.get();
                hc2.g gVar2 = (hc2.g) this.f113568a.Y0.get();
                dVar31 = this.f113568a.Z0;
                mc2.h hVar9 = (mc2.h) dVar31.get();
                lh0.k4 k4Var = (lh0.k4) this.f113568a.Q0.get();
                ac2.f1 f1Var = (ac2.f1) this.f113568a.f113640d1.get();
                dVar32 = this.f113568a.f113657e1;
                return new dc2.e(context4, dVar37, dVar29, X0, aVar4, gVar2, hVar9, k4Var, f1Var, (fc2.a) dVar32.get());
            case 45:
                naVar26 = this.f113568a.f113902s0;
                Context context5 = (Context) naVar26.get();
                aVar2 = this.f113568a.O0;
                return com.pinterest.widget.configuration.k.p0(context5, (lb0.q) aVar2.get());
            case 46:
                naVar27 = this.f113568a.f113902s0;
                Context context6 = (Context) naVar27.get();
                dVar33 = this.f113568a.R0;
                ac2.i iVar3 = (ac2.i) dVar33.get();
                l8.e eVar6 = (l8.e) this.f113568a.P0.get();
                naVar28 = this.f113568a.T0;
                se2.a a16 = bf2.b.a(naVar28);
                naVar29 = this.f113568a.V0;
                se2.a a17 = bf2.b.a(naVar29);
                naVar30 = this.f113568a.W0;
                aVar3 = this.f113568a.O0;
                return new ac2.s(context6, iVar3, eVar6, a16, a17, naVar30, (lb0.q) aVar3.get(), this.f113568a.d3(), (lh0.k4) this.f113568a.Q0.get());
            case 47:
                return new ac2.i((lh0.k4) this.f113568a.Q0.get(), (tu1.g0) this.f113568a.N0.get());
            case 48:
                return new lh0.k4((lh0.z0) this.f113568a.D0.get());
            case 49:
                qVar5 = this.f113568a.f113603b;
                Context context7 = qVar5.f67746a;
                dl2.b.I(context7);
                return new ac2.u(context7, oa.W1(this.f113568a));
            case 50:
                xu1.y yVar = (xu1.y) this.f113568a.I0.get();
                dVar34 = this.f113568a.f113850p0;
                return com.pinterest.widget.configuration.k.P(yVar, (b60.b) dVar34.get(), this.f113568a.d3());
            case 51:
                qVar6 = this.f113568a.f113603b;
                Context context8 = qVar6.f67746a;
                dl2.b.I(context8);
                return new ac2.t(context8, (vu1.a0) this.f113568a.U0.get());
            case 52:
                return new cy.g((xu1.y) this.f113568a.I0.get(), oa.M0(this.f113568a), this.f113568a.d3());
            case 53:
                return new hc2.g((lh0.k4) this.f113568a.Q0.get());
            case 54:
                return new mc2.h();
            case 55:
                dVar35 = this.f113568a.f113622c1;
                return new ac2.f1((lb0.r) dVar35.get());
            case 56:
                se2.a a18 = bf2.b.a(this.f113568a.f113587a1);
                ao2.j0 j0Var3 = (ao2.j0) this.f113568a.G0.get();
                dVar36 = this.f113568a.f113605b1;
                return new lb0.r(a18, j0Var3, bf2.b.a(dVar36), bf2.b.a(this.f113568a.f113780l0), oa.B1(this.f113568a));
            case 57:
                return a02.e.i2(oa.B1(this.f113568a));
            case 58:
                return new fc2.a((lh0.k4) this.f113568a.Q0.get());
            case 59:
                return com.pinterest.widget.configuration.k.y((tu1.n) this.f113568a.f113729i1.get());
            case 60:
                return new tu1.n();
            case 61:
                g10.b stubNetworkInspectorSource = (g10.b) this.f113568a.f113763k1.get();
                Intrinsics.checkNotNullParameter(stubNetworkInspectorSource, "stubNetworkInspectorSource");
                dl2.b.I(stubNetworkInspectorSource);
                return stubNetworkInspectorSource;
            case 62:
                return new g10.b();
            case 63:
                return pb0.g.f99432a;
            case 64:
                rz.e eVar7 = new rz.e();
                eVar7.a(n60.o.f(vd0.c.class, "get(...)"), rz.f.f110230a);
                return eVar7;
            case 65:
                return com.pinterest.widget.configuration.k.l0((m60.w) this.f113568a.f113885r0.get(), (t00.n) this.f113568a.f113975w1.get(), (lh0.d3) this.f113568a.f113993x1.get());
            case 66:
                t00.g factory = (t00.g) this.f113568a.f113957v1.get();
                Intrinsics.checkNotNullParameter(factory, "factory");
                dl2.b.I(factory);
                return factory;
            case 67:
                return new t00.g((b60.b) this.f113568a.f113850p0.get(), (m60.w) this.f113568a.f113885r0.get(), (qb0.e) this.f113568a.f113869q1.get(), (t00.c) this.f113568a.f113886r1.get(), (t00.k) this.f113568a.f113903s1.get(), (m60.e) this.f113568a.f113920t0.get(), (t00.i) this.f113568a.f113939u1.get());
            case 68:
                qb0.e eVar8 = qb0.d.f103396a;
                Intrinsics.checkNotNullExpressionValue(eVar8, "getInstance(...)");
                return eVar8;
            case 69:
                return new t00.c();
            case 70:
                return new t00.k((t00.c) this.f113568a.f113886r1.get());
            case 71:
                return new t00.i((t00.k) this.f113568a.f113903s1.get(), (m60.w) this.f113568a.f113885r0.get(), (i92.k) this.f113568a.f113921t1.get(), (m60.e) this.f113568a.f113920t0.get(), this.f113568a.e2());
            case 72:
                return new i92.k((m60.e) this.f113568a.f113920t0.get(), (m60.w) this.f113568a.f113885r0.get(), (Context) this.f113568a.f113902s0.get());
            case 73:
                return new lh0.d3((lh0.z0) this.f113568a.D0.get());
            case 74:
                OkHttpClient unauthClient = (OkHttpClient) this.f113568a.A1.get();
                tu1.m cronetEngineProviderV2 = (tu1.m) this.f113568a.D1.get();
                tu1.d0 cronetServiceClient = (tu1.d0) this.f113568a.f113711h1.get();
                tb0.h crashReporting = (tb0.h) this.f113568a.f113797m0.get();
                xk2.k cronetExceptionMapper = (xk2.k) this.f113568a.f113746j1.get();
                List requestInfoReceivers = (List) this.f113568a.K0.get();
                su1.i networkInspectorSource = (su1.i) this.f113568a.f113781l1.get();
                lh0.n1 experiments = (lh0.n1) this.f113568a.E0.get();
                Intrinsics.checkNotNullParameter(unauthClient, "unauthClient");
                Intrinsics.checkNotNullParameter(cronetEngineProviderV2, "cronetEngineProviderV2");
                Intrinsics.checkNotNullParameter(cronetServiceClient, "cronetServiceClient");
                Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
                Intrinsics.checkNotNullParameter(cronetExceptionMapper, "cronetExceptionMapper");
                Intrinsics.checkNotNullParameter(requestInfoReceivers, "requestInfoReceivers");
                Intrinsics.checkNotNullParameter(networkInspectorSource, "networkInspectorSource");
                Intrinsics.checkNotNullParameter(experiments, "experiments");
                return new vu1.s(unauthClient, cronetServiceClient, crashReporting, cronetEngineProviderV2, cronetExceptionMapper, networkInspectorSource, requestInfoReceivers, experiments.b("call_timeout"), false);
            case 75:
                OkHttpClient okHttpClient5 = (OkHttpClient) this.f113568a.f114029z1.get();
                z10.h oauthSigningInterceptor = oa.s1(this.f113568a);
                Intrinsics.checkNotNullParameter(okHttpClient5, "okHttpClient");
                Intrinsics.checkNotNullParameter(oauthSigningInterceptor, "oauthSigningInterceptor");
                OkHttpClient.Builder newBuilder = okHttpClient5.newBuilder();
                newBuilder.a(oauthSigningInterceptor);
                return new OkHttpClient(newBuilder);
            case 76:
                tu1.e eVar9 = (tu1.e) this.f113568a.B1.get();
                tu1.f0 f0Var2 = new tu1.f0((gz1.b) this.f113568a.C1.get());
                oa oaVar3 = this.f113568a;
                Context context9 = (Context) oaVar3.f113902s0.get();
                tu1.o listener = new tu1.o(new tu1.f0((gz1.b) oaVar3.C1.get()));
                Intrinsics.checkNotNullParameter(context9, "context");
                Intrinsics.checkNotNullParameter(listener, "listener");
                return new tu1.m(eVar9, f0Var2, new m60.f0(), (tb0.h) this.f113568a.f113797m0.get());
            case 77:
                tu1.d cronetEngineBuilderFactory = new tu1.d((Context) this.f113568a.f113902s0.get());
                Intrinsics.checkNotNullParameter(cronetEngineBuilderFactory, "cronetEngineBuilderFactory");
                return new tu1.e(cronetEngineBuilderFactory);
            case 78:
                return new gz1.b((m60.e) this.f113568a.f113920t0.get());
            case 79:
                pq2.d1 retrofit = (pq2.d1) this.f113568a.H1.get();
                vu1.a0 networkClient = (vu1.a0) this.f113568a.G1.get();
                p00.b converterFactory = oa.k1(this.f113568a);
                rz.c adapterFactory = (rz.c) this.f113568a.f114011y1.get();
                rq2.a gsonConverterFactory = this.f113568a.J2();
                String baseLoggingUrl = oa.i0(this.f113568a);
                vu1.a0 cronetClient = (vu1.a0) this.f113568a.E1.get();
                lh0.n1 experiments2 = (lh0.n1) this.f113568a.E0.get();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Intrinsics.checkNotNullParameter(networkClient, "networkClient");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
                Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
                Intrinsics.checkNotNullParameter(baseLoggingUrl, "baseLoggingUrl");
                Intrinsics.checkNotNullParameter(cronetClient, "cronetClient");
                Intrinsics.checkNotNullParameter(experiments2, "experiments");
                if (experiments2.e() || !cronetClient.b()) {
                    retrofit.getClass();
                    pq2.c1 c1Var2 = new pq2.c1(retrofit);
                    c1Var2.c(baseLoggingUrl);
                    c1Var2.a(adapterFactory);
                    c1Var2.b(converterFactory);
                    oVar = (vy.o) n60.o.h(c1Var2, gsonConverterFactory, vy.o.class, "create(...)");
                } else {
                    retrofit.getClass();
                    pq2.c1 c1Var3 = new pq2.c1(retrofit);
                    c1Var3.f101001a = cronetClient;
                    c1Var3.c(baseLoggingUrl);
                    c1Var3.a(adapterFactory);
                    c1Var3.b(converterFactory);
                    c1Var3.b(gsonConverterFactory);
                    pq2.d1 d2 = c1Var3.d();
                    Intrinsics.checkNotNullExpressionValue(d2, "build(...)");
                    Object b13 = d2.b(vy.o.class);
                    Intrinsics.checkNotNullExpressionValue(b13, "create(...)");
                    oVar = (vy.o) b13;
                }
                dl2.b.I(oVar);
                return oVar;
            case 80:
                OkHttpClient client = (OkHttpClient) this.f113568a.A1.get();
                String url = this.f113568a.Y2();
                vu1.a0 cronetClient2 = (vu1.a0) this.f113568a.G1.get();
                lh0.d3 experiments3 = (lh0.d3) this.f113568a.f113993x1.get();
                Intrinsics.checkNotNullParameter(client, "client");
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(cronetClient2, "cronetClient");
                Intrinsics.checkNotNullParameter(experiments3, "experiments");
                experiments3.getClass();
                lh0.z3 z3Var = lh0.a4.f83297a;
                lh0.g1 g1Var = (lh0.g1) experiments3.f83331a;
                if (!g1Var.o("android_cronet_unauth_api", "enabled", z3Var) && !g1Var.l("android_cronet_unauth_api")) {
                    pq2.c1 c1Var4 = new pq2.c1();
                    c1Var4.c(url);
                    Objects.requireNonNull(client, "client == null");
                    c1Var4.f101001a = client;
                    return c1Var4.d();
                }
                lh0.g1 g1Var2 = (lh0.g1) experiments3.f83331a;
                if (g1Var2.o("android_network_client_async_init", "enabled", z3Var) || g1Var2.l("android_network_client_async_init")) {
                    pq2.c1 c1Var5 = new pq2.c1();
                    c1Var5.c(url);
                    Objects.requireNonNull(cronetClient2, "factory == null");
                    c1Var5.f101001a = cronetClient2;
                    return c1Var5.d();
                }
                if (cronetClient2.b()) {
                    pq2.c1 c1Var6 = new pq2.c1();
                    c1Var6.c(url);
                    c1Var6.f101001a = cronetClient2;
                    return c1Var6.d();
                }
                pq2.c1 c1Var7 = new pq2.c1();
                c1Var7.c(url);
                Objects.requireNonNull(client, "client == null");
                c1Var7.f101001a = client;
                return c1Var7.d();
            case 81:
                vu1.a0 cronetClient3 = (vu1.a0) this.f113568a.U0.get();
                OkHttpClient okHttpClient6 = (OkHttpClient) this.f113568a.A1.get();
                Intrinsics.checkNotNullParameter(cronetClient3, "cronetClient");
                Intrinsics.checkNotNullParameter(okHttpClient6, "okHttpClient");
                return cronetClient3.a(okHttpClient6, null);
            case 82:
                OkHttpClient okHttpClient7 = (OkHttpClient) this.f113568a.f113956v0.get();
                pq2.d1 retrofit3 = (pq2.d1) this.f113568a.f113816n1.get();
                z10.h oauthSigningInterceptor2 = oa.s1(this.f113568a);
                p00.b converterFactory2 = oa.k1(this.f113568a);
                rz.c adapterFactory2 = (rz.c) this.f113568a.f114011y1.get();
                rq2.a gsonConverterFactory2 = this.f113568a.J2();
                String contextLoggingBaseUrl = oa.i0(this.f113568a);
                lh0.n1 experiments4 = (lh0.n1) this.f113568a.E0.get();
                z10.e compressionInterceptor = new z10.e();
                nx.g1 trkDownInterceptor = (nx.g1) this.f113568a.J1.get();
                vu1.a0 cronetClient4 = (vu1.a0) this.f113568a.f113798m1.get();
                vu1.a0 trkCronetClient = (vu1.a0) this.f113568a.E1.get();
                z10.f compressionInterceptorV2 = new z10.f();
                Intrinsics.checkNotNullParameter(okHttpClient7, "okHttpClient");
                Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                Intrinsics.checkNotNullParameter(oauthSigningInterceptor2, "oauthSigningInterceptor");
                Intrinsics.checkNotNullParameter(converterFactory2, "converterFactory");
                Intrinsics.checkNotNullParameter(adapterFactory2, "adapterFactory");
                Intrinsics.checkNotNullParameter(gsonConverterFactory2, "gsonConverterFactory");
                Intrinsics.checkNotNullParameter(contextLoggingBaseUrl, "contextLoggingBaseUrl");
                Intrinsics.checkNotNullParameter(experiments4, "experiments");
                Intrinsics.checkNotNullParameter(compressionInterceptor, "compressionInterceptor");
                Intrinsics.checkNotNullParameter(trkDownInterceptor, "trkDownInterceptor");
                Intrinsics.checkNotNullParameter(cronetClient4, "cronetClient");
                Intrinsics.checkNotNullParameter(trkCronetClient, "trkCronetClient");
                Intrinsics.checkNotNullParameter(compressionInterceptorV2, "compressionInterceptorV2");
                OkHttpClient.Builder newBuilder2 = okHttpClient7.newBuilder();
                newBuilder2.a(trkDownInterceptor);
                experiments4.getClass();
                lh0.z3 z3Var2 = lh0.a4.f83298b;
                lh0.g1 g1Var3 = (lh0.g1) experiments4.f83439a;
                if ((g1Var3.o("android_cronet_context_logging", "enabled", z3Var2) || g1Var3.l("android_cronet_context_logging")) && cronetClient4.b()) {
                    newBuilder2.a(compressionInterceptorV2);
                    newBuilder2.a(oauthSigningInterceptor2);
                    OkHttpClient okHttpClient8 = new OkHttpClient(newBuilder2);
                    vu1.a0 a19 = experiments4.b("usetrkclient") ? trkCronetClient.a(okHttpClient8, null) : cronetClient4.a(okHttpClient8, null);
                    retrofit3.getClass();
                    pq2.c1 c1Var8 = new pq2.c1(retrofit3);
                    c1Var8.f101001a = a19;
                    c1Var8.c(contextLoggingBaseUrl);
                    c1Var8.a(adapterFactory2);
                    c1Var8.b(converterFactory2);
                    c1Var8.b(gsonConverterFactory2);
                    Object b14 = c1Var8.d().b(vy.p.class);
                    Intrinsics.checkNotNullExpressionValue(b14, "create(...)");
                    pVar = (vy.p) b14;
                } else {
                    newBuilder2.a(compressionInterceptor);
                    newBuilder2.a(oauthSigningInterceptor2);
                    OkHttpClient okHttpClient9 = new OkHttpClient(newBuilder2);
                    retrofit3.getClass();
                    pq2.c1 c1Var9 = new pq2.c1(retrofit3);
                    c1Var9.f101001a = okHttpClient9;
                    c1Var9.c(contextLoggingBaseUrl);
                    c1Var9.a(adapterFactory2);
                    c1Var9.b(converterFactory2);
                    c1Var9.b(gsonConverterFactory2);
                    Object b15 = c1Var9.d().b(vy.p.class);
                    Intrinsics.checkNotNullExpressionValue(b15, "create(...)");
                    pVar = (vy.p) b15;
                }
                dl2.b.I(pVar);
                return pVar;
            case 83:
                Resources resources = this.f113568a.b2();
                Intrinsics.checkNotNullParameter(resources, "resources");
                String string = resources.getString(x02.j2.api_host_uri);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                dl2.b.I(string);
                return new nx.g1(string, this.f113568a.Y1());
            case 84:
                pq2.d1 retrofit4 = (pq2.d1) this.f113568a.H1.get();
                p00.b converterFactory3 = oa.k1(this.f113568a);
                rz.c adapterFactory3 = (rz.c) this.f113568a.f114011y1.get();
                rq2.a gsonConverterFactory3 = this.f113568a.J2();
                String baseLoggingUrl2 = oa.i0(this.f113568a);
                Intrinsics.checkNotNullParameter(retrofit4, "retrofit");
                Intrinsics.checkNotNullParameter(converterFactory3, "converterFactory");
                Intrinsics.checkNotNullParameter(adapterFactory3, "adapterFactory");
                Intrinsics.checkNotNullParameter(gsonConverterFactory3, "gsonConverterFactory");
                Intrinsics.checkNotNullParameter(baseLoggingUrl2, "baseLoggingUrl");
                retrofit4.getClass();
                pq2.c1 c1Var10 = new pq2.c1(retrofit4);
                c1Var10.c(baseLoggingUrl2);
                c1Var10.a(adapterFactory3);
                c1Var10.b(converterFactory3);
                c1Var10.b(gsonConverterFactory3);
                Object b16 = c1Var10.d().b(vy.p.class);
                Intrinsics.checkNotNullExpressionValue(b16, "create(...)");
                vy.p pVar4 = (vy.p) b16;
                dl2.b.I(pVar4);
                return pVar4;
            case 85:
                lh0.t2 preferencesExperiments = oa.B1(this.f113568a);
                Intrinsics.checkNotNullParameter(preferencesExperiments, "preferencesExperiments");
                return new nb0.w(preferencesExperiments, 0);
            case 86:
                return new y10.a(com.pinterest.widget.configuration.k.o0(), (m60.e) this.f113568a.f113920t0.get(), (y10.b) this.f113568a.O1.get(), (m60.q) this.f113568a.Q1.get(), (gz1.b) this.f113568a.C1.get(), (Context) this.f113568a.f113902s0.get());
            case 87:
                return new y10.b((m60.e) this.f113568a.f113920t0.get());
            case 88:
                ff0.b pinterestDeveloperOptions = (ff0.b) this.f113568a.P1.get();
                Intrinsics.checkNotNullParameter(pinterestDeveloperOptions, "pinterestDeveloperOptions");
                dl2.b.I(pinterestDeveloperOptions);
                return pinterestDeveloperOptions;
            case 89:
                return new ff0.b(new a7.o(4), this.f113568a.e2());
            case 90:
                return new su1.b();
            case 91:
                HttpLoggingInterceptor httpLoggingInterceptor2 = new HttpLoggingInterceptor(new com.google.firebase.messaging.k());
                HttpLoggingInterceptor.Level level = HttpLoggingInterceptor.Level.HEADERS;
                Intrinsics.checkNotNullParameter(level, "<set-?>");
                httpLoggingInterceptor2.f96342c = level;
                return httpLoggingInterceptor2;
            case 92:
                f30.b apiUtils = (f30.b) this.f113568a.V1.get();
                Intrinsics.checkNotNullParameter(apiUtils, "apiUtils");
                return new JavaNetCookieJar(gp1.j.b(apiUtils));
            case 93:
                return new f30.b((lb0.q) this.f113568a.O0.get(), (m60.e) this.f113568a.f113920t0.get(), this.f113568a.V2());
            case 94:
                qz.c apiNetworkEventListenerFactory = (qz.c) this.f113568a.X1.get();
                Intrinsics.checkNotNullParameter(apiNetworkEventListenerFactory, "apiNetworkEventListenerFactory");
                dl2.b.I(apiNetworkEventListenerFactory);
                return apiNetworkEventListenerFactory;
            case 95:
                return new qz.c((dc2.e) this.f113568a.f113675f1.get(), (lh0.n1) this.f113568a.E0.get());
            case 96:
                return 8192;
            case 97:
                return 6500;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_VIDEO_CREATOR_ANALYTICS_MODULE /* 98 */:
                oa oaVar4 = this.f113568a;
                return new c60.b(oaVar4.f113974w0, oaVar4.Z1());
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NOTE_AND_FAVORITE_MODULE /* 99 */:
                oa oaVar5 = this.f113568a;
                mh0.a userExperimentsDeserializableAdapter = new mh0.a((ph0.a) oaVar5.d2.get(), (lb0.g) oaVar5.f113938u0.get());
                Intrinsics.checkNotNullParameter(userExperimentsDeserializableAdapter, "userExperimentsDeserializableAdapter");
                rz.e eVar10 = new rz.e();
                TypeToken typeToken = new TypeToken(nh0.a.class);
                Intrinsics.checkNotNullExpressionValue(typeToken, "get(...)");
                eVar10.a(typeToken, userExperimentsDeserializableAdapter);
                return eVar10;
            default:
                throw new AssertionError(this.f113569b);
        }
    }

    public final Object b() {
        rz.f fVar = rz.f.f110230a;
        oa oaVar = this.f113568a;
        int i13 = this.f113569b;
        switch (i13) {
            case 100:
                return new ph0.a();
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE /* 101 */:
                return com.pinterest.widget.configuration.k.f0((rz.c) oaVar.f114011y1.get(), oa.m1(oaVar), oaVar.f3(), oaVar.J2());
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE /* 102 */:
                return com.pinterest.widget.configuration.k.e0((nx.o0) oaVar.T1.get());
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE /* 103 */:
                return new z70.f();
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE /* 104 */:
                return new lu1.c((Context) oaVar.f113902s0.get(), (lu1.d) oaVar.f113782l2.get(), (dy.a) oaVar.f113943u5.get(), (tb0.h) oaVar.f113797m0.get());
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE /* 105 */:
                return new lu1.d((tb0.h) oaVar.f113797m0.get(), oa.g1(oaVar));
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID /* 106 */:
                dy.a aVar = new dy.a((nx.d0) oaVar.f113817n2.get(), (lb0.o) oaVar.f114010y0.get(), (lu1.d) oaVar.f113782l2.get(), oa.h1(oaVar), (cr1.a) oaVar.A2.get(), (cr1.a) oaVar.B2.get(), new m60.f0(), (b60.b) oaVar.f113850p0.get(), (m60.e) oaVar.f113920t0.get());
                oa.c1(oaVar, aVar);
                return aVar;
            case RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER /* 107 */:
                return com.pinterest.widget.configuration.k.d0((nx.f0) oaVar.f113747j2.get(), (nx.a1) oaVar.f113799m2.get());
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE /* 108 */:
                return new nx.a1((nx.e0) oaVar.T1.get());
            case RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL /* 109 */:
                return com.pinterest.widget.configuration.k.c((rz.c) oaVar.f114011y1.get(), (p00.b) oaVar.f114030z2.get(), (pq2.c1) oaVar.f113623c2.get(), oaVar.J2());
            case RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL /* 110 */:
                return com.pinterest.widget.configuration.k.W((rz.e) oaVar.f114012y2.get(), new p00.d());
            case RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE /* 111 */:
                return com.pinterest.widget.configuration.k.b((dr1.b) oaVar.f113835o2.get(), (dr1.l) oaVar.f113852p2.get(), (dr1.e) oaVar.f113870q2.get(), (dr1.f) oaVar.f113887r2.get(), (dr1.d) oaVar.f113904s2.get(), (dr1.a) oaVar.f113922t2.get(), (dr1.o) oaVar.f113940u2.get(), (dr1.n) oaVar.f113958v2.get(), (dr1.g) oaVar.f113976w2.get(), (dr1.i) oaVar.f113994x2.get());
            case RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER /* 112 */:
                return new dr1.b();
            case RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL /* 113 */:
                return new dr1.l();
            case RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER /* 114 */:
                return new dr1.e();
            case RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE /* 115 */:
                return new dr1.f();
            case RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW /* 116 */:
                return new dr1.d();
            case RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN /* 117 */:
                return new dr1.a();
            case RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL /* 118 */:
                return new dr1.o();
            case RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL /* 119 */:
                return new dr1.n();
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL /* 120 */:
                return new dr1.g();
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL /* 121 */:
                return new dr1.i();
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN /* 122 */:
                return com.pinterest.widget.configuration.k.g0((rz.c) oaVar.f114011y1.get(), (p00.b) oaVar.f114030z2.get(), oaVar.f3(), oaVar.J2());
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL /* 123 */:
                dy.d dVar = new dy.d((cr1.a) oaVar.A2.get(), (cr1.a) oaVar.B2.get(), new m60.f0(), (oc.c) oaVar.f113907s5.get(), (lb0.o) oaVar.f114010y0.get(), (b60.b) oaVar.f113850p0.get());
                oa.d1(oaVar, dVar);
                return dVar;
            case RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER /* 124 */:
                return com.pinterest.widget.configuration.k.j((u00.a) oaVar.f113890r5.get());
            case RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED /* 125 */:
                return new u00.a((OkHttpClient) oaVar.f113956v0.get(), (vu1.a0) oaVar.f113798m1.get(), (OkHttpClient) oaVar.A1.get(), (String) oaVar.C2.get(), ((Integer) oaVar.E2.get()).intValue(), (d10.g) oaVar.I2.get(), (dl1.t) oaVar.K2.get(), (dl1.t) oaVar.G3.get(), (dl1.t) oaVar.M2.get(), (dl1.t) oaVar.f113661e5.get(), (dl1.t) oaVar.f113678f4.get(), (pc.v) oaVar.f113855p5.get(), oa.G0(oaVar), (m60.e) oaVar.f113920t0.get(), new m60.f0(), new m60.f0(), (ey.k3) oaVar.f113873q5.get(), (lb0.q) oaVar.O0.get(), (lh0.d3) oaVar.f113993x1.get(), oa.D0(oaVar));
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL /* 126 */:
                return com.pinterest.widget.configuration.k.H(oaVar.b2(), oaVar.Z1());
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK /* 127 */:
                return Integer.valueOf(u00.l.a(((Long) oaVar.D2.get()).longValue()));
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN /* 128 */:
                return Long.valueOf(u00.l.b());
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS /* 129 */:
                return new d10.g((ContextWrapper) oaVar.f113902s0.get(), (c10.d) oaVar.G2.get(), oa.G0(oaVar), (e10.j) oaVar.H2.get());
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN /* 130 */:
                m60.w wVar = (m60.w) oaVar.f113885r0.get();
                m60.f0 f0Var = vb0.j.f125466a;
                dl2.b.I(f0Var);
                return new c10.d(wVar, f0Var, oa.Q0(oaVar), oa.P0(oaVar), (b60.b) oaVar.f113850p0.get());
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_VIDEO_GRID_CELL /* 131 */:
                return new c10.a();
            case RecyclerViewTypes.VIEW_TYPE_FEED_SECTION_TITLE /* 132 */:
                return com.pinterest.widget.configuration.k.G((vy.m) oaVar.M1.get());
            case RecyclerViewTypes.VIEW_TYPE_PIN_CAROUSEL /* 133 */:
                x02.x2 x2Var = (x02.x2) oaVar.f113783l3.get();
                com.pinterest.widget.configuration.k.O(x2Var);
                return x2Var;
            case RecyclerViewTypes.VIEW_TYPE_PIN_MINI_CELL /* 134 */:
                return com.pinterest.widget.configuration.k.q((dl1.p) oaVar.J2.get(), (dl1.a0) oaVar.f113591a5.get(), (dl1.z) oaVar.f113609b5.get(), (gl1.d) oaVar.f113626c5.get(), (o9) oaVar.Z4.get(), (fl1.e) oaVar.L2.get(), (b60.b) oaVar.f113850p0.get());
            case RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL /* 135 */:
                return com.pinterest.widget.configuration.k.K(l10.b.a(), oa.S1(oaVar));
            case RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL /* 136 */:
                return com.pinterest.widget.configuration.k.r2((o9) oaVar.Z4.get());
            case RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_IMAGE /* 137 */:
                return new o9(this);
            case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL /* 138 */:
                return com.pinterest.widget.configuration.k.j0((pq2.d1) oaVar.W3.get());
            case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM /* 139 */:
                return com.pinterest.widget.configuration.k.a0((rz.c) oaVar.f114011y1.get(), oa.O0(oaVar), (pq2.c1) oaVar.f113623c2.get(), oaVar.J2());
            case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ACTION_ITEM /* 140 */:
                return new zz.a((ModelDeserializerWithSaveAndMerge) oaVar.f113589a3.get());
            case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM_HIDDEN /* 141 */:
                return new DynamicStoryDeserializer((tb0.h) oaVar.f113797m0.get(), l10.b.a(), (ModelDeserializerWithSaveAndMerge) oaVar.f113905s3.get(), bf2.b.a(oaVar.Q4), (lb0.q) oaVar.O0.get(), (lh0.d3) oaVar.f113993x1.get(), new zy.b0(8));
            case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL /* 142 */:
                return new UserDeserializer(bf2.b.a(oaVar.K2), (fl1.e) oaVar.L2.get(), (d12.i) oaVar.N2.get());
            case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_IMAGE /* 143 */:
                return new fz0();
            case RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM /* 144 */:
                return new d12.h(l10.b.a(), bf2.b.a(oaVar.M2), bf2.b.a(oaVar.f113678f4), bf2.b.a(oaVar.f113732i4), bf2.b.a(oaVar.G3), bf2.b.a(oaVar.K2));
            case RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM_TINTED /* 145 */:
                x02.x0 repository = (x02.x0) oaVar.f113765k3.get();
                Intrinsics.checkNotNullParameter(repository, "repository");
                dl2.b.I(repository);
                return repository;
            case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_VIDEO /* 146 */:
                oaVar.getClass();
                gw modelHelper = l10.b.a();
                Intrinsics.checkNotNullParameter(modelHelper, "modelHelper");
                new p10.b();
                p10.m mVar = new p10.m(p10.a.f98624a);
                Intrinsics.checkNotNullExpressionValue(mVar, "buildBoardLocalDataSource(...)");
                w9 w9Var = (w9) oaVar.O3.get();
                fl1.a policy = (fl1.a) oaVar.T2.get();
                Intrinsics.checkNotNullParameter(policy, "policy");
                dl2.b.I(policy);
                return com.pinterest.widget.configuration.k.r(mVar, w9Var, policy, new gl1.c(null, 7), new com.pinterest.api.model.x9(), (fl1.e) oaVar.O2.get(), (x02.x2) oaVar.f113800m3.get(), bf2.b.a(oaVar.f113660e4), (b60.b) oaVar.f113850p0.get(), (lh0.d3) oaVar.f113993x1.get());
            case RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY /* 147 */:
                return new w9(this);
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_BUBBLES_PACKAGE_GRID_MODULE /* 148 */:
                pq2.d1 retrofit = (pq2.d1) oaVar.M3.get();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Object b13 = retrofit.b(e12.d.class);
                Intrinsics.checkNotNullExpressionValue(b13, "create(...)");
                e12.d dVar2 = (e12.d) b13;
                dl2.b.I(dVar2);
                return dVar2;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_BRAND_PACKAGE_GRID_MODULE /* 149 */:
                pq2.c1 retrofit3 = (pq2.c1) oaVar.f113623c2.get();
                rz.c adapterFactory = (rz.c) oaVar.f114011y1.get();
                rq2.a gsonConverterFactory = oaVar.J2();
                p00.b converterFactory = oa.n1(oaVar);
                t00.e boardRepositoryOnFailureRouterFactory = (t00.e) oaVar.L3.get();
                Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
                Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Intrinsics.checkNotNullParameter(boardRepositoryOnFailureRouterFactory, "boardRepositoryOnFailureRouterFactory");
                pq2.c1 j13 = df.j1.j(retrofit3, rz.c.b(adapterFactory, boardRepositoryOnFailureRouterFactory, null, false, 61));
                j13.b(converterFactory);
                j13.b(gsonConverterFactory);
                pq2.d1 d2 = j13.d();
                Intrinsics.checkNotNullExpressionValue(d2, "build(...)");
                return d2;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY /* 150 */:
                return a02.e.M1((vz.a) oaVar.Q2.get(), (BoardDeserializer) oaVar.P2.get(), (b22.b) oaVar.Y2.get(), (x02.q1) oaVar.f114031z3.get(), (NestedBoardSectionNameRecommendationDeserializer) oaVar.H3.get(), new BoardToolDeserializerAdapter(), (a22.a) oaVar.J3.get(), oaVar.R2());
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIFIED_FILTER_MULTI_SELECT_ITEM /* 151 */:
                return new vz.a((ke0.b) oaVar.P2.get());
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRICE_FILTER_ITEM /* 152 */:
                return new BoardDeserializer(bf2.b.a(oaVar.M2), (d12.i) oaVar.N2.get(), bf2.b.a(oaVar.O2));
            case RecyclerViewTypes.VIEW_TYPE_STANDARD_FILTER_ITEM /* 153 */:
                return new com.pinterest.api.model.o8();
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRODUCT_FILTER_HEADER /* 154 */:
                return new b22.b((b22.c) oaVar.W2.get());
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_FILTER /* 155 */:
                return new PinDeserializer(oa.N0(oaVar), bf2.b.a(oaVar.G3), (d12.i) oaVar.N2.get());
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY_FILTER_ITEM /* 156 */:
                return new s40();
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_SORT_FILTER /* 157 */:
                x02.i2 repository2 = (x02.i2) oaVar.F3.get();
                Intrinsics.checkNotNullParameter(repository2, "repository");
                dl2.b.I(repository2);
                return repository2;
            case RecyclerViewTypes.VIEW_TYPE_STELA_IN_FLASHLIGHT_ONE_COLUMN /* 158 */:
                dl1.p localDataSource = (dl1.p) oaVar.S2.get();
                dl1.z persistencePolicy = (dl1.z) oaVar.U2.get();
                gl1.d repositorySchedulerPolicy = (gl1.d) oaVar.V2.get();
                x9 retrofitRemoteDataSourceFactory = (x9) oaVar.f113731i3.get();
                x9 pinRemoteDataSourceFactory = (x9) oaVar.f113731i3.get();
                o50 modelValidator = (o50) oaVar.f113748j3.get();
                s40 modelMerger = oa.N0(oaVar);
                se2.a lazyBoardRepository = bf2.b.a(oaVar.f113765k3);
                se2.a lazyUserRepository = bf2.b.a(oaVar.f113800m3);
                se2.a lazyBoardSectionRepository = bf2.b.a(oaVar.B3);
                e12.c boardOrganizationService = (e12.c) oaVar.E3.get();
                Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
                Intrinsics.checkNotNullParameter(persistencePolicy, "persistencePolicy");
                Intrinsics.checkNotNullParameter(repositorySchedulerPolicy, "repositorySchedulerPolicy");
                Intrinsics.checkNotNullParameter(retrofitRemoteDataSourceFactory, "retrofitRemoteDataSourceFactory");
                Intrinsics.checkNotNullParameter(pinRemoteDataSourceFactory, "pinRemoteDataSourceFactory");
                Intrinsics.checkNotNullParameter(modelValidator, "modelValidator");
                Intrinsics.checkNotNullParameter(modelMerger, "modelMerger");
                Intrinsics.checkNotNullParameter(lazyBoardRepository, "lazyBoardRepository");
                Intrinsics.checkNotNullParameter(lazyUserRepository, "lazyUserRepository");
                Intrinsics.checkNotNullParameter(lazyBoardSectionRepository, "lazyBoardSectionRepository");
                Intrinsics.checkNotNullParameter(boardOrganizationService, "boardOrganizationService");
                return new x02.i2(localDataSource, retrofitRemoteDataSourceFactory.a(), persistencePolicy, repositorySchedulerPolicy, modelValidator, modelMerger, pb0.g.f99432a, new dl1.r(), new uk2.f(), new uk2.f(), new uk2.f(), new uk2.f(), new AtomicInteger(), uk2.l.R(), new HashMap(), pinRemoteDataSourceFactory, null, lazyUserRepository, lazyBoardSectionRepository, lazyBoardRepository, boardOrganizationService);
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_EDUCATION_HEADER /* 159 */:
                gw modelHelper2 = l10.b.a();
                Intrinsics.checkNotNullParameter(modelHelper2, "modelHelper");
                new p10.p();
                p10.m mVar2 = new p10.m(p10.o.f98631a);
                Intrinsics.checkNotNullExpressionValue(mVar2, "buildPinLocalDataSource(...)");
                return mVar2;
            case 160:
                fl1.a policy2 = (fl1.a) oaVar.T2.get();
                Intrinsics.checkNotNullParameter(policy2, "policy");
                dl2.b.I(policy2);
                return policy2;
            case RecyclerViewTypes.VIEW_TYPE_PLACEHOLDER /* 161 */:
                return new fl1.a();
            case RecyclerViewTypes.VIEW_TYPE_FULL_SPAN_PLACEHOLDER /* 162 */:
                return new gl1.c(null, 7);
            case RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM /* 163 */:
                return new x9(this);
            case RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM_LOADING /* 164 */:
                pq2.d1 retrofit4 = (pq2.d1) oaVar.f113695g3.get();
                Intrinsics.checkNotNullParameter(retrofit4, "retrofit");
                Object b14 = retrofit4.b(PinService.class);
                Intrinsics.checkNotNullExpressionValue(b14, "create(...)");
                PinService pinService = (PinService) b14;
                dl2.b.I(pinService);
                return pinService;
            case RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM_CLEAR /* 165 */:
                pq2.c1 retrofit5 = (pq2.c1) oaVar.f113623c2.get();
                rz.c adapterFactory2 = (rz.c) oaVar.f114011y1.get();
                rq2.a gsonConverterFactory2 = oaVar.J2();
                p00.b converterFactory2 = (p00.b) oaVar.f113677f3.get();
                Intrinsics.checkNotNullParameter(retrofit5, "retrofit");
                Intrinsics.checkNotNullParameter(adapterFactory2, "adapterFactory");
                Intrinsics.checkNotNullParameter(gsonConverterFactory2, "gsonConverterFactory");
                Intrinsics.checkNotNullParameter(converterFactory2, "converterFactory");
                retrofit5.a(adapterFactory2);
                retrofit5.b(converterFactory2);
                retrofit5.b(gsonConverterFactory2);
                pq2.d1 d13 = retrofit5.d();
                Intrinsics.checkNotNullExpressionValue(d13, "build(...)");
                return d13;
            case RecyclerViewTypes.VIEW_TYPE_LEGO_EMPTY_STATE_MESSAGE /* 166 */:
                p00.d bodyConverter = new p00.d();
                rz.e registry = (rz.e) oaVar.f113659e3.get();
                Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
                Intrinsics.checkNotNullParameter(registry, "registry");
                return new p00.b(registry, bodyConverter, null);
            case RecyclerViewTypes.VIEW_TRY_ON_FEED_PRODUCT_CARD /* 167 */:
                e00.a pinJsonDeserializableAdapter = (e00.a) oaVar.X2.get();
                b22.b pinFeedJsonDeserializableAdapter = (b22.b) oaVar.Y2.get();
                b22.e pinListWithBookmarkJsonDeserializableAdapter = new b22.e((d12.i) oaVar.N2.get(), 0);
                vz.b boardNameJsonDeserializableAdapter = (vz.b) oaVar.Z2.get();
                sz.b boardListJsonDeserializableAdapter = new sz.b(8);
                e00.b pinTagAndStoryDeserializableAdapter = new e00.b(bf2.b.a(oaVar.f113589a3));
                d22.a repinActivityFeedJsonDeserializableAdapter = (d22.a) oaVar.f113607b3.get();
                g00.a partnerCheckoutJsonDeserializableAdapter = (g00.a) oaVar.f113624c3.get();
                sz.b pinTranslationsJsonDeserializerAdapter = new sz.b(9);
                sz.c thirdPartyAdConfigDeserializableAdapter = (sz.c) oaVar.f113641d3.get();
                Intrinsics.checkNotNullParameter(pinJsonDeserializableAdapter, "pinJsonDeserializableAdapter");
                Intrinsics.checkNotNullParameter(pinFeedJsonDeserializableAdapter, "pinFeedJsonDeserializableAdapter");
                Intrinsics.checkNotNullParameter(pinListWithBookmarkJsonDeserializableAdapter, "pinListWithBookmarkJsonDeserializableAdapter");
                Intrinsics.checkNotNullParameter(boardNameJsonDeserializableAdapter, "boardNameJsonDeserializableAdapter");
                Intrinsics.checkNotNullParameter(boardListJsonDeserializableAdapter, "boardListJsonDeserializableAdapter");
                Intrinsics.checkNotNullParameter(pinTagAndStoryDeserializableAdapter, "pinTagAndStoryDeserializableAdapter");
                Intrinsics.checkNotNullParameter(repinActivityFeedJsonDeserializableAdapter, "repinActivityFeedJsonDeserializableAdapter");
                Intrinsics.checkNotNullParameter(partnerCheckoutJsonDeserializableAdapter, "partnerCheckoutJsonDeserializableAdapter");
                Intrinsics.checkNotNullParameter(pinTranslationsJsonDeserializerAdapter, "pinTranslationsJsonDeserializerAdapter");
                Intrinsics.checkNotNullParameter(thirdPartyAdConfigDeserializableAdapter, "thirdPartyAdConfigDeserializableAdapter");
                rz.e eVar = new rz.e();
                TypeToken typeToken = new TypeToken(f30.class);
                Intrinsics.checkNotNullExpressionValue(typeToken, "get(...)");
                eVar.a(typeToken, pinJsonDeserializableAdapter);
                TypeToken typeToken2 = new TypeToken(PinFeed.class);
                Intrinsics.checkNotNullExpressionValue(typeToken2, "get(...)");
                eVar.a(typeToken2, pinFeedJsonDeserializableAdapter);
                TypeToken typeToken3 = new TypeToken(b22.d.class);
                Intrinsics.checkNotNullExpressionValue(typeToken3, "get(...)");
                eVar.a(typeToken3, pinListWithBookmarkJsonDeserializableAdapter);
                TypeToken a13 = TypeToken.a(new TypeToken(List.class).f33846a, new TypeToken(com.pinterest.api.model.y8.class).f33847b);
                Intrinsics.checkNotNullExpressionValue(a13, "getParameterized(...)");
                eVar.a(a13, boardNameJsonDeserializableAdapter);
                TypeToken a14 = TypeToken.a(new TypeToken(List.class).f33846a, new TypeToken(com.pinterest.api.model.v7.class).f33847b);
                Intrinsics.checkNotNullExpressionValue(a14, "getParameterized(...)");
                eVar.a(a14, boardListJsonDeserializableAdapter);
                TypeToken typeToken4 = new TypeToken(t50.class);
                Intrinsics.checkNotNullExpressionValue(typeToken4, "get(...)");
                eVar.a(typeToken4, pinTagAndStoryDeserializableAdapter);
                TypeToken typeToken5 = new TypeToken(yc0.class);
                Intrinsics.checkNotNullExpressionValue(typeToken5, "get(...)");
                eVar.a(typeToken5, repinActivityFeedJsonDeserializableAdapter);
                TypeToken typeToken6 = new TypeToken(vd0.c.class);
                Intrinsics.checkNotNullExpressionValue(typeToken6, "get(...)");
                eVar.a(typeToken6, fVar);
                TypeToken typeToken7 = new TypeToken(z10.class);
                Intrinsics.checkNotNullExpressionValue(typeToken7, "get(...)");
                eVar.a(typeToken7, partnerCheckoutJsonDeserializableAdapter);
                TypeToken typeToken8 = new TypeToken(x50.class);
                Intrinsics.checkNotNullExpressionValue(typeToken8, "get(...)");
                eVar.a(typeToken8, pinTranslationsJsonDeserializerAdapter);
                TypeToken typeToken9 = new TypeToken(xs0.class);
                Intrinsics.checkNotNullExpressionValue(typeToken9, "get(...)");
                eVar.a(typeToken9, thirdPartyAdConfigDeserializableAdapter);
                return eVar;
            case RecyclerViewTypes.VIEW_TYPE_USER_PIN_REACTION /* 168 */:
                return new e00.a((ModelDeserializerWithSaveAndMerge) oaVar.W2.get());
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_SPOTLIGHT /* 169 */:
                return new vz.b();
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE /* 170 */:
                return new d22.a((PinDeserializer) oaVar.W2.get());
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_VIDEO /* 171 */:
                return new g00.a();
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE /* 172 */:
                return new sz.c();
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_VIDEO /* 173 */:
                return new o50();
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE_FULL_SPAN /* 174 */:
                x02.x2 userRepository = (x02.x2) oaVar.f113783l3.get();
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                dl2.b.I(userRepository);
                return userRepository;
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_VIDEO_FULL_SPAN /* 175 */:
                oaVar.getClass();
                gw modelHelper3 = l10.b.a();
                Intrinsics.checkNotNullParameter(modelHelper3, "modelHelper");
                new p10.d();
                p10.m mVar3 = new p10.m(p10.c.f98625a);
                Intrinsics.checkNotNullExpressionValue(mVar3, "buildBoardSectionLocalDataSource(...)");
                j12.j remoteDataSource = new j12.j((j12.k) oaVar.A3.get());
                Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
                fl1.a policy3 = (fl1.a) oaVar.T2.get();
                Intrinsics.checkNotNullParameter(policy3, "policy");
                dl2.b.I(policy3);
                return new x02.z0(mVar3, remoteDataSource, policy3, new gl1.c(null, 7), new com.pinterest.api.model.ha(), bf2.b.a(oaVar.f113765k3));
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE_FULL_SPAN /* 176 */:
                pq2.c1 retrofitBuilder = (pq2.c1) oaVar.f113623c2.get();
                rz.c adapterFactory3 = (rz.c) oaVar.f114011y1.get();
                rq2.a gsonConverterFactory3 = oaVar.J2();
                p00.d bodyConverter2 = new p00.d();
                e00.b boardSectionJsonDeserializerAdapter = new e00.b((ke0.a) oaVar.f113818n3.get());
                vz.c boardSectionFeedJsonDeserializableAdapter = (vz.c) oaVar.f113836o3.get();
                BoardToolDeserializerAdapter boardToolDeserializerAdapter = new BoardToolDeserializerAdapter();
                BoardSectionNameRecommendationDeserializer boardSectionNameRecommendationDeserializer = (BoardSectionNameRecommendationDeserializer) oaVar.f113853p3.get();
                x02.q1 dynamicFeedJsonDeserializableAdapter = (x02.q1) oaVar.f114031z3.get();
                Intrinsics.checkNotNullParameter(boardSectionJsonDeserializerAdapter, "boardSectionJsonDeserializerAdapter");
                Intrinsics.checkNotNullParameter(boardSectionFeedJsonDeserializableAdapter, "boardSectionFeedJsonDeserializableAdapter");
                Intrinsics.checkNotNullParameter(boardToolDeserializerAdapter, "boardToolDeserializerAdapter");
                Intrinsics.checkNotNullParameter(boardSectionNameRecommendationDeserializer, "boardSectionNameRecommendationDeserializer");
                Intrinsics.checkNotNullParameter(dynamicFeedJsonDeserializableAdapter, "dynamicFeedJsonDeserializableAdapter");
                rz.e registry2 = new rz.e();
                TypeToken typeToken10 = new TypeToken(com.pinterest.api.model.ba.class);
                Intrinsics.checkNotNullExpressionValue(typeToken10, "get(...)");
                registry2.a(typeToken10, boardSectionJsonDeserializerAdapter);
                TypeToken typeToken11 = new TypeToken(BoardSectionFeed.class);
                Intrinsics.checkNotNullExpressionValue(typeToken11, "get(...)");
                registry2.a(typeToken11, boardSectionFeedJsonDeserializableAdapter);
                TypeToken typeToken12 = new TypeToken(vd0.c.class);
                Intrinsics.checkNotNullExpressionValue(typeToken12, "get(...)");
                registry2.a(typeToken12, fVar);
                TypeToken typeToken13 = new TypeToken(DynamicFeed.class);
                Intrinsics.checkNotNullExpressionValue(typeToken13, "get(...)");
                registry2.a(typeToken13, dynamicFeedJsonDeserializableAdapter);
                TypeToken a15 = TypeToken.a(new TypeToken(List.class).f33846a, new TypeToken(com.pinterest.api.model.la.class).f33847b);
                Intrinsics.checkNotNullExpressionValue(a15, "getParameterized(...)");
                registry2.a(a15, boardToolDeserializerAdapter);
                TypeToken a16 = TypeToken.a(new TypeToken(List.class).f33846a, new TypeToken(com.pinterest.api.model.ga.class).f33847b);
                Intrinsics.checkNotNullExpressionValue(a16, "getParameterized(...)");
                registry2.a(a16, boardSectionNameRecommendationDeserializer);
                Intrinsics.checkNotNullParameter(bodyConverter2, "bodyConverter");
                Intrinsics.checkNotNullParameter(registry2, "registry");
                p00.b converterFactory3 = new p00.b(registry2, bodyConverter2, null);
                Intrinsics.checkNotNullParameter(retrofitBuilder, "retrofitBuilder");
                Intrinsics.checkNotNullParameter(adapterFactory3, "adapterFactory");
                Intrinsics.checkNotNullParameter(gsonConverterFactory3, "gsonConverterFactory");
                Intrinsics.checkNotNullParameter(converterFactory3, "converterFactory");
                retrofitBuilder.a(adapterFactory3);
                retrofitBuilder.b(converterFactory3);
                retrofitBuilder.b(gsonConverterFactory3);
                pq2.d1 retrofit6 = retrofitBuilder.d();
                Intrinsics.checkNotNullParameter(retrofit6, "retrofit");
                Object b15 = retrofit6.b(j12.k.class);
                Intrinsics.checkNotNullExpressionValue(b15, "create(...)");
                j12.k kVar = (j12.k) b15;
                dl2.b.I(kVar);
                return kVar;
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_VIDEO_FULL_SPAN /* 177 */:
                return new BoardSectionDeserializer((d12.i) oaVar.N2.get());
            case RecyclerViewTypes.VIEW_TYPE_GMA_INLINE_AD /* 178 */:
                return new vz.c((ke0.b) oaVar.f113818n3.get());
            case RecyclerViewTypes.VIEW_TYPE_GMA_INLINE_AD_FULL_SPAN /* 179 */:
                return new BoardSectionNameRecommendationDeserializer();
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP /* 180 */:
                return new x02.q1((qh) oaVar.f114013y3.get());
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_NAVIGATION_REP /* 181 */:
                return new qh(new v10.a((w10.a) oaVar.f113888r3.get(), bf2.b.a(oaVar.f113905s3), (ModelDeserializerWithSaveAndMerge) oaVar.f113589a3.get(), (ModelDeserializerWithSaveAndMerge) oaVar.W2.get(), (ModelDeserializerWithSaveAndMerge) oaVar.P2.get(), (ke0.a) oaVar.f113923t3.get(), (ke0.a) oaVar.f113941u3.get(), (ke0.a) oaVar.f113959v3.get(), (ke0.a) oaVar.f113977w3.get(), (ke0.a) oaVar.f113995x3.get(), new v10.d((d12.i) oaVar.N2.get())));
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_DEFAULT_REP /* 182 */:
                return new w10.a((ke0.a) oaVar.f113871q3.get());
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_STYLE_REP /* 183 */:
                return new BoardMoreIdeasCardsCarouselDeserializer((ModelDeserializerWithSaveAndMerge) oaVar.f113589a3.get());
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_IMAGE_REP /* 184 */:
                return new BubbleSeparatorDeserializer();
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_IMAGE_GRID_REP /* 185 */:
                return new HomeFeedTabsDeserializer();
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_TOPIC_TILE /* 186 */:
                return new ProductGroupDeserializer();
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_EDITORIAL_CARD /* 187 */:
                return new BoardNoteDeserializer();
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_IMAGE_EDITORIAL_CARD /* 188 */:
                return new TodayArticleDeserializer();
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_IMAGE_WITH_TITLE_OVERLAY /* 189 */:
                pq2.c1 retrofit7 = (pq2.c1) oaVar.f113623c2.get();
                rz.e eVar2 = (rz.e) oaVar.D3.get();
                p00.b converterFactory4 = new p00.b(eVar2, n60.o.k(eVar2, "registry", "bodyConverter"), null);
                rz.c adapterFactory4 = (rz.c) oaVar.f114011y1.get();
                Intrinsics.checkNotNullParameter(retrofit7, "retrofit");
                Intrinsics.checkNotNullParameter(converterFactory4, "converterFactory");
                Intrinsics.checkNotNullParameter(adapterFactory4, "adapterFactory");
                retrofit7.a(adapterFactory4);
                retrofit7.b(converterFactory4);
                Object b16 = retrofit7.d().b(e12.c.class);
                Intrinsics.checkNotNullExpressionValue(b16, "create(...)");
                e12.c cVar = (e12.c) b16;
                dl2.b.I(cVar);
                return cVar;
            case RecyclerViewTypes.VIEW_TYPE_ICON_AND_TEXT_INLINE_BUBBLE /* 190 */:
                e12.a bulkActionStatusResponseJsonDeserializableAdapter = (e12.a) oaVar.C3.get();
                Intrinsics.checkNotNullParameter(bulkActionStatusResponseJsonDeserializableAdapter, "bulkActionStatusResponseJsonDeserializableAdapter");
                rz.e eVar3 = new rz.e();
                TypeToken typeToken14 = new TypeToken(t60.a.class);
                Intrinsics.checkNotNullExpressionValue(typeToken14, "get(...)");
                eVar3.a(typeToken14, bulkActionStatusResponseJsonDeserializableAdapter);
                return eVar3;
            case RecyclerViewTypes.VIEW_TYPE_LENS_PHOTO /* 191 */:
                return new e12.a();
            case RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY /* 192 */:
                return new NestedBoardSectionNameRecommendationDeserializer();
            case RecyclerViewTypes.VIEW_TYPE_LENS_HISTORY /* 193 */:
                return new a22.a((ke0.a) oaVar.I3.get());
            case RecyclerViewTypes.VIEW_TYPE_OVERSCROLL_SEARCH_CELL /* 194 */:
                return new PearInsightDeserializer();
            case RecyclerViewTypes.VIEW_TYPE_USER /* 195 */:
                return new t00.e((b60.b) oaVar.f113850p0.get(), (m60.w) oaVar.f113885r0.get(), (qb0.e) oaVar.f113869q1.get(), (t00.c) oaVar.f113886r1.get(), (t00.k) oaVar.f113903s1.get(), (m60.e) oaVar.f113920t0.get(), (t00.i) oaVar.f113939u1.get());
            case RecyclerViewTypes.VIEW_SHOP_THE_LOOK_CLOSEUP_MODULE /* 196 */:
                dl1.p pVar = (dl1.p) oaVar.Q3.get();
                uq0.b bVar = (uq0.b) oaVar.f113625c4.get();
                dl1.z zVar = (dl1.z) oaVar.f113642d4.get();
                m60.g0 g0Var = (m60.g0) oaVar.f113590a4.get();
                a02.e.L4(g0Var);
                return new x02.y(pVar, bVar, zVar, g0Var);
            case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_HERO /* 197 */:
                dl1.t0 stub = (dl1.t0) oaVar.P3.get();
                Intrinsics.checkNotNullParameter(stub, "stub");
                dl2.b.I(stub);
                return stub;
            case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_THREE_PINS_COLLECTION /* 198 */:
                return new dl1.t0();
            case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_SINGLE_VIDEO /* 199 */:
                se2.a retrofitSource = bf2.b.a(oaVar.f113608b4);
                Intrinsics.checkNotNullParameter(retrofitSource, "retrofitSource");
                Object obj = ((bf2.b) retrofitSource).get();
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                uq0.b bVar2 = (uq0.b) obj;
                dl2.b.I(bVar2);
                return bVar2;
            default:
                throw new AssertionError(i13);
        }
    }

    public final Object c() {
        rz.f fVar = rz.f.f110230a;
        oa oaVar = this.f113568a;
        int i13 = this.f113569b;
        switch (i13) {
            case 200:
                j22.b bVar = (j22.b) oaVar.U3.get();
                e12.d dVar = (e12.d) oaVar.V3.get();
                e12.e eVar = (e12.e) oaVar.X3.get();
                PinService pinService = (PinService) oaVar.f113713h3.get();
                String B1 = a02.e.B1(oaVar.b2(), oaVar.Z1());
                uj2.a0 a0Var = (uj2.a0) oaVar.Y3.get();
                uj2.a0 a0Var2 = (uj2.a0) oaVar.Z3.get();
                se2.a a13 = bf2.b.a(oaVar.P2);
                m60.g0 g0Var = (m60.g0) oaVar.f113590a4.get();
                a02.e.L4(g0Var);
                return new g12.b(bVar, dVar, eVar, pinService, B1, a0Var, a0Var2, a13, g0Var);
            case 201:
                return a02.e.h4((rz.c) oaVar.f114011y1.get(), oa.p1(oaVar), (pq2.c1) oaVar.f113623c2.get(), oaVar.J2());
            case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_STORY_PIN /* 202 */:
                return a02.e.g4((vz.a) oaVar.Q2.get(), (b22.b) oaVar.Y2.get(), (j22.f) oaVar.S3.get(), (x02.q1) oaVar.f114031z3.get());
            case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_CUSTOM_COVER /* 203 */:
                return new j22.f((ModelDeserializerWithSaveAndMerge) oaVar.f113905s3.get(), (ModelDeserializerWithSaveAndMerge) oaVar.W2.get(), (ModelDeserializerWithSaveAndMerge) oaVar.f113589a3.get(), (ke0.a) oaVar.R3.get(), (dl1.t) oaVar.K2.get());
            case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_SINGLE_CREATOR /* 204 */:
                return new SearchFilterModifierEligibilityDeserializer();
            case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_HEADER /* 205 */:
                return a02.e.N1((rz.c) oaVar.f114011y1.get(), oa.n1(oaVar), (pq2.c1) oaVar.f113623c2.get(), oaVar.J2());
            case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_FOOTER /* 206 */:
                return a02.e.V2((pq2.d1) oaVar.W3.get());
            case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_FEED_FOOTER /* 207 */:
                return a02.e.q2();
            case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_SECTION /* 208 */:
                return a02.e.p2();
            case RecyclerViewTypes.VIEW_TYPE_TODAY_ARTICLE_BOARD_SECTION_HEADER /* 209 */:
                return com.pinterest.widget.configuration.k.S();
            case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_RELATED_ARTICLES_HEADER /* 210 */:
                x02.v policy = new x02.v(0);
                Intrinsics.checkNotNullParameter(policy, "policy");
                return policy;
            case RecyclerViewTypes.VIEW_TYPE_GO_TO_HOME_FEED_FOOTER /* 211 */:
                x02.z0 z0Var = (x02.z0) oaVar.B3.get();
                com.pinterest.widget.configuration.k.L(z0Var);
                return z0Var;
            case RecyclerViewTypes.VIEW_TYPE_SIMPLE_ACTION_STORY /* 212 */:
                x02.v1 v1Var = (x02.v1) oaVar.f113960v4.get();
                com.pinterest.widget.configuration.k.N(v1Var);
                return v1Var;
            case RecyclerViewTypes.VIEW_TYPE_CONVERSATION_GIF_REACTION /* 213 */:
                return new x02.v1((dl1.p) oaVar.f113696g4.get(), (dl1.a0) oaVar.f113889r4.get(), (dl1.z) oaVar.f113906s4.get(), (gl1.d) oaVar.f113924t4.get(), (dl1.r0) oaVar.f113942u4.get());
            case RecyclerViewTypes.VIEW_TYPE_INBOX_HEADER /* 214 */:
                return com.pinterest.widget.configuration.k.w0(l10.b.a());
            case RecyclerViewTypes.VIEW_TYPE_BOARD_INVITE_HEADER /* 215 */:
                u12.d dVar2 = (u12.d) oaVar.f113872q4.get();
                com.pinterest.widget.configuration.k.s2(dVar2);
                return dVar2;
            case RecyclerViewTypes.VIEW_TYPE_MESSAGES_HEADER /* 216 */:
                return new u12.d((u12.e) oaVar.f113854p4.get());
            case RecyclerViewTypes.VIEW_TYPE_CONTACTS_HEADER /* 217 */:
                return com.pinterest.widget.configuration.k.J((rz.c) oaVar.f114011y1.get(), (p00.b) oaVar.f113837o4.get(), (pq2.c1) oaVar.f113623c2.get(), oaVar.J2());
            case RecyclerViewTypes.VIEW_TYPE_STYLE_HEADER /* 218 */:
                return com.pinterest.widget.configuration.k.p2((rz.e) oaVar.f113819n4.get(), new p00.d());
            case RecyclerViewTypes.VIEW_TYPE_STYLE_DESCRIPTION /* 219 */:
                rz.e eVar2 = (rz.e) oaVar.f113714h4.get();
                com.pinterest.widget.configuration.k.o2(eVar2, (u12.b) oaVar.f113766k4.get(), (u12.f) oaVar.f113784l4.get(), (u12.c) oaVar.f113801m4.get());
                return eVar2;
            case RecyclerViewTypes.VIEW_TYPE_STORY_EDUCATION_BANNER /* 220 */:
                return com.pinterest.widget.configuration.k.V(new sz.b(5), new sz.b(7), new sz.b(6));
            case RecyclerViewTypes.VIEW_TYPE_STORY_TODAY_TAB_UPSELL_DOUBLE /* 221 */:
                return new u12.b((ModelDeserializerWithSaveAndMerge) oaVar.f113749j4.get());
            case RecyclerViewTypes.VIEW_TYPE_STORY_TODAY_TAB_UPSELL_SINGLE /* 222 */:
                return new InterestDeserializer(bf2.b.a(oaVar.f113732i4), l10.b.a());
            case RecyclerViewTypes.VIEW_TYPE_COUNTRY_CODE /* 223 */:
                return new u12.f((ke0.b) oaVar.f113749j4.get());
            case RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL /* 224 */:
                return new u12.c((ke0.b) oaVar.f113749j4.get());
            case RecyclerViewTypes.VIEW_TYPE_STORY_SELECT_OR_REORDER_PINS /* 225 */:
                fl1.a aVar = (fl1.a) oaVar.T2.get();
                com.pinterest.widget.configuration.k.m2(aVar);
                return aVar;
            case RecyclerViewTypes.VIEW_TYPE_STORY_GROUP_MY_PINS /* 226 */:
                return com.pinterest.widget.configuration.k.w2();
            case RecyclerViewTypes.VIEW_TYPE_VTO_BUBBLE_CONTAINER /* 227 */:
                return new et();
            case RecyclerViewTypes.VIEW_TYPE_PROFILE_BOARDLESS_PINS_HEADER /* 228 */:
                return new GenericModelDeserializer((ModelDeserializerWithSaveAndMerge) oaVar.f113905s3.get(), (ModelDeserializerWithSaveAndMerge) oaVar.W2.get(), (ModelDeserializerWithSaveAndMerge) oaVar.P2.get(), (ModelDeserializerWithSaveAndMerge) oaVar.f113749j4.get(), (ModelDeserializerWithSaveAndMerge) oaVar.f113589a3.get(), (ke0.a) oaVar.f113978w4.get(), (ModelDeserializerWithSave) oaVar.f113996x4.get(), (ke0.a) oaVar.f113923t3.get(), (ke0.a) oaVar.f114014y4.get(), (ke0.a) oaVar.f114032z4.get(), (ke0.a) oaVar.A4.get(), (ke0.a) oaVar.B4.get(), (ke0.a) oaVar.f113853p3.get(), (ke0.a) oaVar.f113818n3.get(), (ke0.a) oaVar.D4.get(), (ke0.a) oaVar.f113959v3.get(), new UsecaseDeserializer(), (ke0.a) oaVar.f113995x3.get(), (ke0.a) oaVar.E4.get(), (ke0.a) oaVar.F4.get(), (ke0.a) oaVar.G4.get(), (ke0.a) oaVar.H4.get(), (ke0.a) oaVar.I4.get(), (ke0.a) oaVar.J4.get(), (ke0.a) oaVar.K4.get(), (ke0.a) oaVar.L4.get(), (ke0.a) oaVar.I3.get(), (ke0.a) oaVar.M4.get(), (ke0.a) oaVar.N4.get(), (ke0.a) oaVar.O4.get(), (ke0.a) oaVar.P4.get(), (d12.i) oaVar.N2.get());
            case RecyclerViewTypes.VIEW_TYPE_IN_LINE_VTO /* 229 */:
                return new ContextualSearchObjectDeserializer((ModelDeserializerWithSaveAndMerge) oaVar.W2.get());
            case RecyclerViewTypes.VIEW_TYPE_AFFILIATE_LINK_IMAGE /* 230 */:
                return new ExploreArticleDeserializer((ModelDeserializerWithSaveAndMerge) oaVar.f113905s3.get(), (ModelDeserializerWithSaveAndMerge) oaVar.W2.get(), l10.b.a());
            case RecyclerViewTypes.VIEW_TYPE_RECENTLY_SAVED_PRODUCT_HEADER /* 231 */:
                return new TaxonomyDeserializer();
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_LIST_FILTER_ITEM /* 232 */:
                return new ExploreSearchObjectDeserializer((ModelDeserializerWithSaveAndMerge) oaVar.W2.get());
            case RecyclerViewTypes.VIEW_TYPE_SEARCH_BOARD_CELL /* 233 */:
                return new TrendingHashtagDeserializer();
            case RecyclerViewTypes.VIEW_TYPE_SHARESHEET_APP /* 234 */:
                return new UserDidItDataDeserializer();
            case RecyclerViewTypes.VIEW_TYPE_SHARESHEET_CONTACT /* 235 */:
                return new IdeasCardDeserializer((ke0.a) oaVar.C4.get());
            case RecyclerViewTypes.VIEW_TYPE_BOARD_MORE_IDEAS_UPSELL_CARD /* 236 */:
                return new IdeasCardFeedMetadataDeserializer((ke0.a) oaVar.P2.get(), (ke0.a) oaVar.f113818n3.get(), (ModelDeserializerWithSaveAndMerge) oaVar.f113749j4.get());
            case RecyclerViewTypes.VIEW_TYPE_BOARD_MORE_IDEAS_UPSELL_LIST_ITEM /* 237 */:
                return new IdeaPinStickerDeserializer();
            case RecyclerViewTypes.VIEW_TYPE_MORE_IDEAS_BOARD_NAME_HEADER /* 238 */:
                return new IdeaPinStickerCategoryDeserializer();
            case RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL /* 239 */:
                return new IdeaPinInteractiveStickerDeserializer();
            case RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM /* 240 */:
                return new IdeaPinMusicMetadataDeserializer();
            case RecyclerViewTypes.VIEW_TYPE_SHOWCASE_SUBPAGE_ITEM /* 241 */:
                return new IdeaPinMusicTagDeserializer();
            case RecyclerViewTypes.VIEW_TYPE_SHOWCASE_SUBPIN_ITEM /* 242 */:
                return new IdeaPinMusicArtistDeserializer();
            case RecyclerViewTypes.VIEW_TYPE_BRAND_MULTI_IMAGE_REP_ITEM /* 243 */:
                return new BoardMoreIdeasFeedUpsellDeserializer();
            case RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION /* 244 */:
                return new PinClusterDeserializer();
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_TRIPLE_PREVIEW_DISPLAY_CARD_REP /* 245 */:
                return new RelatedFilterTabDeserializer();
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_STACKED_COLLAGE_DISPLAY_CARD_REP /* 246 */:
                return new UnifiedCommentsPreviewDeserializer();
            case RecyclerViewTypes.VIEW_TYPE_PEAR_INSIGHT_HEADER /* 247 */:
                return new OnebarmoduleDeserializer();
            case RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER /* 248 */:
                return new ShuffleDeserializer();
            case RecyclerViewTypes.VIEW_TYPE_CUTOUT_COLLAGE_PILL_REP /* 249 */:
                return new zz.b(bf2.b.a(oaVar.f113589a3));
            case 250:
                return new k22.h((ke0.b) oaVar.f113905s3.get());
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NON_CREATOR_ANALYTICS_MODULE /* 251 */:
                return new m00.a();
            case RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN /* 252 */:
                return new HierarchicalInterestDeserializableAdapter((ke0.a) oaVar.V4.get());
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLUSTER /* 253 */:
                return new HierarchicalInterestDeserializer();
            case RecyclerViewTypes.VIEW_TYPE_STORY_BLOCK_PATTERN /* 254 */:
                return new h00.a();
            case 255:
                return new fl1.a();
            case RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER /* 256 */:
                return com.pinterest.widget.configuration.k.b0();
            case RecyclerViewTypes.VIEW_TYPE_COMMENT_STICKER /* 257 */:
                x02.f1 f1Var = (x02.f1) oaVar.f113838o5.get();
                com.pinterest.widget.configuration.k.M(f1Var);
                return f1Var;
            case RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW /* 258 */:
                return com.pinterest.widget.configuration.k.w((dl1.p) oaVar.f113643d5.get(), (dl1.a0) oaVar.f113785l5.get(), (dl1.z) oaVar.f113802m5.get(), (gl1.d) oaVar.f113820n5.get());
            case RecyclerViewTypes.VIEW_TYPE_SPOTLIGHT_COLLECTIONS /* 259 */:
                return com.pinterest.widget.configuration.k.v0(l10.b.a());
            case RecyclerViewTypes.VIEW_TYPE_PROTECTED_BOARD_HEADER /* 260 */:
                return com.pinterest.widget.configuration.k.q2(bf2.b.a(oaVar.f113767k5));
            case RecyclerViewTypes.VIEW_TYPE_MORE_IDEAS_ON_ENDLESS_SCROLL_HEADER /* 261 */:
                return new j12.j((q12.b) oaVar.f113750j5.get());
            case RecyclerViewTypes.VIEW_TYPE_PRODUCT_FILTER_DIVIDER /* 262 */:
                return com.pinterest.widget.configuration.k.x((rz.c) oaVar.f114011y1.get(), oa.q1(oaVar), (pq2.c1) oaVar.f113623c2.get(), oaVar.J2());
            case RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_BOARDS /* 263 */:
                ConversationDeserializer conversationDeserializer = oa.C0(oaVar);
                Intrinsics.checkNotNullParameter(conversationDeserializer, "conversationDeserializer");
                rz.e eVar3 = new rz.e();
                TypeToken typeToken = new TypeToken(vd0.c.class);
                Intrinsics.checkNotNullExpressionValue(typeToken, "get(...)");
                eVar3.a(typeToken, fVar);
                TypeToken typeToken2 = new TypeToken(ue.class);
                Intrinsics.checkNotNullExpressionValue(typeToken2, "get(...)");
                eVar3.a(typeToken2, new q12.a(conversationDeserializer, 0));
                TypeToken typeToken3 = new TypeToken(ConversationFeed.class);
                Intrinsics.checkNotNullExpressionValue(typeToken3, "get(...)");
                eVar3.a(typeToken3, new q12.a(conversationDeserializer, 1));
                TypeToken a14 = TypeToken.a(new TypeToken(List.class).f33846a, new TypeToken(com.pinterest.api.model.v7.class).f33847b);
                Intrinsics.checkNotNullExpressionValue(a14, "getParameterized(...)");
                eVar3.a(a14, new sz.b(8));
                return eVar3;
            case RecyclerViewTypes.VIEW_TYPE_ATG_VISUALIZATION_BANNER /* 264 */:
                com.pinterest.api.model.p6 store = (com.pinterest.api.model.p6) oaVar.f113679f5.get();
                Intrinsics.checkNotNullParameter(store, "store");
                com.pinterest.api.model.i7 i7Var = new com.pinterest.api.model.i7(store);
                gl1.b apolloLink = new gl1.b();
                Intrinsics.checkNotNullParameter(apolloLink, "apolloLink");
                i7Var.f38687b = apolloLink;
                return i7Var;
            case RecyclerViewTypes.VIEW_TYPE_PROMOTED_PIN_VIDEO /* 265 */:
                return new com.pinterest.api.model.p6(l10.b.a());
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIT_GRID /* 266 */:
                return new ye();
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIT_CARD /* 267 */:
                return new fl1.a();
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIT_THUMBNAIL /* 268 */:
                return new gl1.c(null, 7);
            case RecyclerViewTypes.VIEW_TYPE_FILTER_REMOVAL_BUTTON /* 269 */:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ae.s sVar = new ae.s(null, 0 == true ? 1 : 0, Intrinsics.d(null, Boolean.TRUE), 0);
                pc.w customScalarType = c50.y0.f26457a.i();
                a10.e customScalarAdapter = v00.a.f123766a;
                Intrinsics.checkNotNullParameter(customScalarType, "customScalarType");
                Intrinsics.checkNotNullParameter(customScalarAdapter, "customScalarAdapter");
                linkedHashMap.put(customScalarType.f99598g, customScalarAdapter);
                return new pc.v(linkedHashMap, sVar);
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_FILTER_EMPTY_STATE_EOF /* 270 */:
                pb0.a clock = (pb0.a) oaVar.f113834o1.get();
                rd.j spanSubmitter = new rd.j(oaVar.M1);
                ey.j3 perfLogUtils = ey.j3.f60510a;
                Intrinsics.checkNotNullParameter(perfLogUtils, "perfLogUtils");
                ey.c4 networkCellTypeProvider = new ey.c4();
                m60.e applicationInfo = (m60.e) oaVar.f113920t0.get();
                qb0.e networkUtils = (qb0.e) oaVar.f113869q1.get();
                b60.b activeUserManager = (b60.b) oaVar.f113850p0.get();
                Intrinsics.checkNotNullParameter(clock, "clock");
                Intrinsics.checkNotNullParameter(spanSubmitter, "spanSubmitter");
                Intrinsics.checkNotNullParameter(networkCellTypeProvider, "networkCellTypeProvider");
                Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
                Intrinsics.checkNotNullParameter(networkUtils, "networkUtils");
                Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
                m60.d dVar3 = (m60.d) applicationInfo;
                String c13 = dVar3.c(Boolean.FALSE);
                Intrinsics.checkNotNullExpressionValue(c13, "getVersionName(...)");
                dVar3.h();
                wy0 f13 = ((b60.d) activeUserManager).f();
                return new ey.k3(clock, spanSubmitter, networkCellTypeProvider, c13, networkUtils, f13 != null ? f13.getUid() : null);
            case RecyclerViewTypes.VIEW_TYPE_BOARD_CONVERSATION_THREAD /* 271 */:
                return new e82.j((lu1.b) oaVar.f113961v5.get(), (x10.d) oaVar.f113997x5.get(), (cr1.a) oaVar.A2.get(), (b60.b) oaVar.f113850p0.get(), (ga) oaVar.f114033z5.get());
            case RecyclerViewTypes.VIEW_TYPE_PROMOTED_PIN_VIDEO_AD_EXCLUDE /* 272 */:
                pq2.c1 retrofit = (pq2.c1) oaVar.f113623c2.get();
                sz.b submitEtsyOauthResponseAdapter = new sz.b(10);
                f22.c deactivationPermissionResponseAdapter = new f22.c();
                f22.a conversionEligibilityAdapter = new f22.a((x02.x2) oaVar.f113800m3.get());
                UserDeserializer userDeserializer = (UserDeserializer) oaVar.f113905s3.get();
                Intrinsics.checkNotNullParameter(submitEtsyOauthResponseAdapter, "submitEtsyOauthResponseAdapter");
                Intrinsics.checkNotNullParameter(deactivationPermissionResponseAdapter, "deactivationPermissionResponseAdapter");
                Intrinsics.checkNotNullParameter(conversionEligibilityAdapter, "conversionEligibilityAdapter");
                Intrinsics.checkNotNullParameter(userDeserializer, "userDeserializer");
                rz.e adapterRegistry = new rz.e();
                TypeToken typeToken4 = new TypeToken(f22.e.class);
                Intrinsics.checkNotNullExpressionValue(typeToken4, "get(...)");
                adapterRegistry.a(typeToken4, submitEtsyOauthResponseAdapter);
                TypeToken typeToken5 = new TypeToken(rq0.a.class);
                Intrinsics.checkNotNullExpressionValue(typeToken5, "get(...)");
                adapterRegistry.a(typeToken5, conversionEligibilityAdapter);
                TypeToken typeToken6 = new TypeToken(f22.b.class);
                Intrinsics.checkNotNullExpressionValue(typeToken6, "get(...)");
                adapterRegistry.a(typeToken6, deactivationPermissionResponseAdapter);
                TypeToken typeToken7 = new TypeToken(wy0.class);
                Intrinsics.checkNotNullExpressionValue(typeToken7, "get(...)");
                adapterRegistry.a(typeToken7, new e12.b(userDeserializer, 1));
                TypeToken typeToken8 = new TypeToken(vd0.c.class);
                Intrinsics.checkNotNullExpressionValue(typeToken8, "get(...)");
                adapterRegistry.a(typeToken8, fVar);
                p00.d bodyConverter = new p00.d();
                Intrinsics.checkNotNullParameter(adapterRegistry, "adapterRegistry");
                Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
                p00.b converterFactory = new p00.b(adapterRegistry, bodyConverter, null);
                rz.c adapterFactory = (rz.c) oaVar.f114011y1.get();
                t00.j errorMessageOnFailureRouterFactory = (t00.j) oaVar.f113979w5.get();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
                Intrinsics.checkNotNullParameter(errorMessageOnFailureRouterFactory, "errorMessageOnFailureRouterFactory");
                retrofit.a(rz.c.b(adapterFactory, errorMessageOnFailureRouterFactory, null, false, 61));
                retrofit.b(converterFactory);
                Object b13 = retrofit.d().b(f22.d.class);
                Intrinsics.checkNotNullExpressionValue(b13, "create(...)");
                f22.d dVar4 = (f22.d) b13;
                dl2.b.I(dVar4);
                return new x10.d(dVar4, (x02.x2) oaVar.f113800m3.get(), new uo.a((oc.c) oaVar.f113907s5.get(), 0), (b60.b) oaVar.f113850p0.get());
            case RecyclerViewTypes.VIEW_TYPE_SPOTLIGHT_COLLECTIONS_AD_EXCLUDE /* 273 */:
                return new t00.j((b60.b) oaVar.f113850p0.get(), oaVar.e2(), (m60.w) oaVar.f113885r0.get(), (qb0.e) oaVar.f113869q1.get(), (t00.c) oaVar.f113886r1.get(), (t00.k) oaVar.f113903s1.get(), (m60.e) oaVar.f113920t0.get(), (t00.i) oaVar.f113939u1.get());
            case RecyclerViewTypes.VIEW_TYPE_PIN_FULL_SPAN_VIDEO_AD_EXCLUDE /* 274 */:
                return new ga(this);
            case RecyclerViewTypes.VIEW_TYPE_PIN_FULL_SPAN_AD_EXCLUDE /* 275 */:
                return new or1.i((vy.m) oaVar.M1.get(), (m60.e) oaVar.f113920t0.get(), (b60.b) oaVar.f113850p0.get(), (nx.d0) oaVar.f113817n2.get());
            case RecyclerViewTypes.VIEW_TYPE_PIN_VIDEO_AD_EXCLUDE /* 276 */:
                return new e82.p((lu1.b) oaVar.f113961v5.get(), (cr1.a) oaVar.A2.get());
            case RecyclerViewTypes.VIEW_TYPE_PIN_AD_EXCLUDE /* 277 */:
                return new lr1.i((gz1.b) oaVar.C1.get());
            case RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN_AD_EXCLUDE /* 278 */:
                bf2.a aVar2 = oaVar.f113905s3;
                mo1.d dVar5 = (mo1.d) oaVar.D5.get();
                nx.d0 d0Var = (nx.d0) oaVar.f113817n2.get();
                cr1.g gVar = (cr1.g) oaVar.G5.get();
                OkHttpClient okHttpClient = (OkHttpClient) oaVar.f114029z1.get();
                return new lb2.n(aVar2, dVar5, d0Var, gVar, new cr1.d((rz.c) oaVar.f114011y1.get(), (p00.b) oaVar.L5.get(), oaVar.K2(), (er1.b) oaVar.F5.get(), (vu1.a0) oaVar.E5.get(), oaVar.Y2(), okHttpClient, oaVar.J2()), new lb2.x((at1.d) oaVar.f113902s0.get(), (vy.m) oaVar.M1.get(), (nx.d0) oaVar.f113817n2.get(), (nx.o0) oaVar.T1.get(), oaVar.f113938u0, oaVar.Q5, oaVar.D0, (m60.e) oaVar.f113920t0.get(), (lh0.n1) oaVar.E0.get(), (or1.i) oaVar.f114015y5.get(), (cr1.a) oaVar.A2.get(), oaVar.R5, (u20.d) oaVar.Y5.get(), (b60.b) oaVar.f113850p0.get(), (ia) oaVar.f113662e6.get(), (lb0.q) oaVar.O0.get(), (f30.b) oaVar.V1.get(), new com.pinterest.pushnotification.c(new uo.a((oc.c) oaVar.f113907s5.get(), 0), oaVar.k2()), oaVar.A6), (or1.i) oaVar.f114015y5.get(), new m60.f0(), (b60.b) oaVar.f113850p0.get(), (cy.k) oaVar.S0.get(), (ey.k3) oaVar.f113873q5.get(), new lh0.z1((lh0.z0) oaVar.D0.get()), (lh0.g1) oaVar.D0.get(), (x02.x2) oaVar.f113800m3.get());
            case RecyclerViewTypes.VIEW_TYPE_SHUFFLE_CAROUSEL /* 279 */:
                return new mo1.d((tb0.h) oaVar.f113797m0.get(), (nx.e0) oaVar.T1.get());
            case RecyclerViewTypes.VIEW_TYPE_PIN_WEBVIEW_AD /* 280 */:
                return new cr1.g((rz.c) oaVar.f114011y1.get(), oa.O0(oaVar), oaVar.K2(), (er1.b) oaVar.F5.get(), (vu1.a0) oaVar.E5.get(), oaVar.Y2(), (OkHttpClient) oaVar.f114029z1.get(), oaVar.J2());
            case 281:
                vu1.a0 cronetClient = (vu1.a0) oaVar.U0.get();
                OkHttpClient privateOkHttpClient = (OkHttpClient) oaVar.f114029z1.get();
                Intrinsics.checkNotNullParameter(cronetClient, "cronetClient");
                Intrinsics.checkNotNullParameter(privateOkHttpClient, "privateOkHttpClient");
                return cronetClient.a(privateOkHttpClient, null);
            case 282:
                return new er1.b((m60.e) oaVar.f113920t0.get(), (b60.b) oaVar.f113850p0.get(), (i92.k) oaVar.f113921t1.get(), oaVar.e2());
            case 283:
                rz.e registry = (rz.e) oaVar.K5.get();
                Intrinsics.checkNotNullParameter(registry, "registry");
                return new p00.b(registry, null, null);
            case 284:
                rz.e registry2 = (rz.e) oaVar.f113714h4.get();
                dr1.b authenticationResultDeserializer = (dr1.b) oaVar.f113835o2.get();
                dr1.j ssoInfoDataResponseJsonDeserializableAdapter = (dr1.j) oaVar.H5.get();
                dr1.k ssoUserInfoDataResponseJsonDeserializableAdapter = (dr1.k) oaVar.I5.get();
                dr1.m userLoginDataJsonDeserializableAdapter = (dr1.m) oaVar.J5.get();
                Intrinsics.checkNotNullParameter(registry2, "registry");
                Intrinsics.checkNotNullParameter(authenticationResultDeserializer, "authenticationResultDeserializer");
                Intrinsics.checkNotNullParameter(ssoInfoDataResponseJsonDeserializableAdapter, "ssoInfoDataResponseJsonDeserializableAdapter");
                Intrinsics.checkNotNullParameter(ssoUserInfoDataResponseJsonDeserializableAdapter, "ssoUserInfoDataResponseJsonDeserializableAdapter");
                Intrinsics.checkNotNullParameter(userLoginDataJsonDeserializableAdapter, "userLoginDataJsonDeserializableAdapter");
                TypeToken typeToken9 = new TypeToken(qr1.d.class);
                Intrinsics.checkNotNullExpressionValue(typeToken9, "get(...)");
                registry2.a(typeToken9, authenticationResultDeserializer);
                TypeToken typeToken10 = new TypeToken(vd0.c.class);
                Intrinsics.checkNotNullExpressionValue(typeToken10, "get(...)");
                registry2.a(typeToken10, fVar);
                TypeToken typeToken11 = new TypeToken(qr1.d0.class);
                Intrinsics.checkNotNullExpressionValue(typeToken11, "get(...)");
                registry2.a(typeToken11, ssoInfoDataResponseJsonDeserializableAdapter);
                TypeToken typeToken12 = new TypeToken(qr1.e0.class);
                Intrinsics.checkNotNullExpressionValue(typeToken12, "get(...)");
                registry2.a(typeToken12, ssoUserInfoDataResponseJsonDeserializableAdapter);
                TypeToken typeToken13 = new TypeToken(qr1.g0.class);
                Intrinsics.checkNotNullExpressionValue(typeToken13, "get(...)");
                registry2.a(typeToken13, userLoginDataJsonDeserializableAdapter);
                return registry2;
            case 285:
                return new dr1.j();
            case 286:
                return new dr1.k();
            case 287:
                return new dr1.m();
            case 288:
                return new dh0.d((ug0.i) oaVar.P5.get(), new HashMap(), new HashMap(), (m60.w) oaVar.f113885r0.get(), (m60.e) oaVar.f113920t0.get());
            case 289:
                return new ug0.i((tg0.b) oaVar.N5.get(), (m60.e) oaVar.f113920t0.get(), (nx.d0) oaVar.f113817n2.get(), (wg0.a) oaVar.O5.get(), new a7.o(4));
            case 290:
                pq2.c1 c1Var = (pq2.c1) oaVar.f113623c2.get();
                rz.e eVar4 = (rz.e) oaVar.M5.get();
                p00.b bVar2 = new p00.b(eVar4, n60.o.k(eVar4, "adapterRegistry", "bodyConverter"), null);
                rz.c adapterFactory2 = (rz.c) oaVar.f114011y1.get();
                rq2.a n13 = n60.o.n(oaVar, c1Var, "retrofit", bVar2, "converterFactory");
                Intrinsics.checkNotNullParameter(adapterFactory2, "adapterFactory");
                n60.o.u(n13, "gsonConverterFactory", c1Var, adapterFactory2, bVar2);
                tg0.b bVar3 = (tg0.b) n60.o.h(c1Var, n13, tg0.b.class, "create(...)");
                dl2.b.I(bVar3);
                return bVar3;
            case 291:
                rz.e eVar5 = new rz.e();
                TypeToken typeToken14 = new TypeToken(vd0.c.class);
                Intrinsics.checkNotNullExpressionValue(typeToken14, "get(...)");
                eVar5.a(typeToken14, fVar);
                return eVar5;
            case 292:
                return new wg0.a((lb0.r) oaVar.f113622c1.get(), (nm.o) oaVar.f113833o0.get());
            case 293:
                Context context = (Context) oaVar.f113902s0.get();
                Intrinsics.checkNotNullParameter(context, "applicationContext");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter("pinterest-db", "name");
                ja.a0 a15 = se.l.a(context, PinterestDatabase.class, "pinterest-db");
                xd0.h typeConverter = new xd0.h(new m60.f0());
                Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
                a15.f75156e.add(typeConverter);
                a15.a(be0.b.f22732a);
                a15.a(be0.b.f22733b);
                a15.a(be0.b.f22734c);
                a15.a(be0.b.f22735d);
                return (PinterestDatabase) a15.b();
            case 294:
                return new u20.d((u20.a) oaVar.V5.get(), (u20.b) oaVar.W5.get(), (qz.a) oaVar.X5.get());
            case 295:
                pq2.c1 retrofit3 = (pq2.c1) oaVar.U5.get();
                Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                Object b14 = retrofit3.d().b(u20.a.class);
                Intrinsics.checkNotNullExpressionValue(b14, "create(...)");
                u20.a aVar3 = (u20.a) b14;
                dl2.b.I(aVar3);
                return aVar3;
            case 296:
                pq2.c1 retrofit4 = (pq2.c1) oaVar.f113623c2.get();
                rz.c adapterFactory3 = (rz.c) oaVar.f114011y1.get();
                rq2.a gsonConverterFactory = oaVar.J2();
                p00.b converterFactory2 = (p00.b) oaVar.T5.get();
                Intrinsics.checkNotNullParameter(retrofit4, "retrofit");
                Intrinsics.checkNotNullParameter(adapterFactory3, "adapterFactory");
                Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
                Intrinsics.checkNotNullParameter(converterFactory2, "converterFactory");
                retrofit4.a(adapterFactory3);
                retrofit4.b(converterFactory2);
                retrofit4.b(gsonConverterFactory);
                Intrinsics.checkNotNullExpressionValue(retrofit4, "addConverterFactory(...)");
                return retrofit4;
            case 297:
                p00.d bodyConverter2 = new p00.d();
                rz.e registry3 = (rz.e) oaVar.S5.get();
                Intrinsics.checkNotNullParameter(bodyConverter2, "bodyConverter");
                Intrinsics.checkNotNullParameter(registry3, "registry");
                return new p00.b(registry3, bodyConverter2, null);
            case 298:
                rz.e eVar6 = new rz.e();
                TypeToken typeToken15 = new TypeToken(vd0.c.class);
                Intrinsics.checkNotNullExpressionValue(typeToken15, "get(...)");
                eVar6.a(typeToken15, fVar);
                return eVar6;
            case 299:
                pq2.c1 retrofit5 = (pq2.c1) oaVar.U5.get();
                String trkBaseHost = oaVar.Y1();
                Resources resources = oaVar.b2();
                Intrinsics.checkNotNullParameter(retrofit5, "retrofit");
                Intrinsics.checkNotNullParameter(trkBaseHost, "trkBaseHost");
                Intrinsics.checkNotNullParameter(resources, "resources");
                String string = resources.getString(x02.j2.api_host_placeholder_v3_base);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                retrofit5.c(df.j1.U(string, new Object[]{trkBaseHost}));
                Object b15 = retrofit5.d().b(u20.b.class);
                Intrinsics.checkNotNullExpressionValue(b15, "create(...)");
                u20.b bVar4 = (u20.b) b15;
                dl2.b.I(bVar4);
                return bVar4;
            default:
                throw new AssertionError(i13);
        }
    }

    public final Object d() {
        rz.f fVar = rz.f.f110230a;
        oa oaVar = this.f113568a;
        int i13 = this.f113569b;
        switch (i13) {
            case AdSize.MEDIUM_RECTANGLE_WIDTH /* 300 */:
                return new qz.a();
            case ads_mobile_sdk.wb.W0 /* 301 */:
                return new ia(this);
            case ads_mobile_sdk.wb.X0 /* 302 */:
                return new ja(this);
            case 303:
                return new ka(this);
            case 304:
                return com.pinterest.widget.configuration.k.o(oaVar.f3(), (p00.b) oaVar.L5.get(), (rz.c) oaVar.f114011y1.get(), oaVar.J2(), (er1.b) oaVar.F5.get());
            case 305:
                return new la(this);
            case 306:
                return new ma(this);
            case 307:
                return new e9(this);
            case 308:
                return new f9(this);
            case 309:
                return new g9(this);
            case 310:
                return new h9(this);
            case 311:
                return new i9(this);
            case 312:
                return new tr1.a(oaVar.s2());
            case 313:
                return new fr1.c((nx.d0) oaVar.f113817n2.get(), (cr1.f) oaVar.f113803m6.get());
            case 314:
                return com.pinterest.widget.configuration.k.v(oaVar.f3(), (p00.b) oaVar.f113786l6.get(), (rz.c) oaVar.f114011y1.get(), oaVar.J2(), (er1.b) oaVar.F5.get());
            case 315:
                return com.pinterest.widget.configuration.k.r0((rz.e) oaVar.f113768k6.get());
            case 316:
                rz.e eVar = (rz.e) oaVar.f113714h4.get();
                com.pinterest.widget.configuration.k.u(eVar, (dr1.c) oaVar.f113751j6.get());
                return eVar;
            case 317:
                return new dr1.c();
            case 318:
                return new j9(this);
            case 319:
                return new k9(this);
            case 320:
                return new l9(this);
            case 321:
                return new m9(this);
            case 322:
                return new n9(this);
            case 323:
                return new p9(this);
            case 324:
                return new q9(this);
            case 325:
                return new r9(this);
            case 326:
                return new s9(this);
            case 327:
                return new t9(this);
            case 328:
                CookieManager cookieManager = CookieManager.getInstance();
                Intrinsics.checkNotNullExpressionValue(cookieManager, "getInstance(...)");
                dl2.b.I(cookieManager);
                return cookieManager;
            case 329:
                return new kz1.a((kz1.c) oaVar.C6.get());
            case 330:
                Context context = oaVar.f113603b.f67746a;
                dl2.b.I(context);
                return new kz1.c(context);
            case 331:
                return a02.e.K1((rz.c) oaVar.f114011y1.get(), a02.e.u3(a02.e.J1((h12.b) oaVar.F6.get(), (f12.b) oaVar.G6.get(), (k22.h) oaVar.T4.get()), new p00.d()), (pq2.c1) oaVar.f113623c2.get());
            case 332:
                return new h12.b((BoardInviteDeserializer) oaVar.E6.get());
            case 333:
                return new BoardInviteDeserializer(bf2.b.a(oaVar.K2), (BoardDeserializer) oaVar.P2.get(), (UserDeserializer) oaVar.f113905s3.get(), l10.b.a());
            case 334:
                return new f12.b((BoardInviteDeserializer) oaVar.E6.get());
            case 335:
                return new e82.f((cr1.e) oaVar.K6.get(), new e82.a((lb0.o) oaVar.f113780l0.get()), (nx.d0) oaVar.f113817n2.get());
            case 336:
                pq2.c1 c1Var = (pq2.c1) oaVar.f113623c2.get();
                p00.b bVar = (p00.b) oaVar.J6.get();
                rz.c adapterFactory = (rz.c) oaVar.f114011y1.get();
                rq2.a gsonConverterFactory = n60.o.n(oaVar, c1Var, "retrofitBuilder", bVar, "converterFactory");
                Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
                Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
                pq2.c1 j13 = df.j1.j(c1Var, rz.c.b(adapterFactory, null, new AtomicBoolean(false), false, 39));
                j13.a(adapterFactory);
                j13.b(bVar);
                j13.b(gsonConverterFactory);
                Object b13 = j13.d().b(cr1.e.class);
                Intrinsics.checkNotNullExpressionValue(b13, "create(...)");
                cr1.e eVar2 = (cr1.e) b13;
                dl2.b.I(eVar2);
                return eVar2;
            case 337:
                rz.e eVar3 = (rz.e) oaVar.I6.get();
                return new p00.b(eVar3, n60.o.k(eVar3, "registry", "bodyConverter"), null);
            case 338:
                dr1.b authenticationResultDeserializer = (dr1.b) oaVar.f113835o2.get();
                dr1.l trackingSettingsResponseAdapter = (dr1.l) oaVar.f113852p2.get();
                dr1.e multiFactorDataResponseJsonDeserializableAdapter = (dr1.e) oaVar.f113870q2.get();
                dr1.a accessTokenDataResponseJsonDeserializableAdapter = (dr1.a) oaVar.f113922t2.get();
                Intrinsics.checkNotNullParameter(authenticationResultDeserializer, "authenticationResultDeserializer");
                Intrinsics.checkNotNullParameter(trackingSettingsResponseAdapter, "trackingSettingsResponseAdapter");
                Intrinsics.checkNotNullParameter(multiFactorDataResponseJsonDeserializableAdapter, "multiFactorDataResponseJsonDeserializableAdapter");
                Intrinsics.checkNotNullParameter(accessTokenDataResponseJsonDeserializableAdapter, "accessTokenDataResponseJsonDeserializableAdapter");
                rz.e eVar4 = new rz.e();
                TypeToken typeToken = new TypeToken(qr1.d.class);
                Intrinsics.checkNotNullExpressionValue(typeToken, "get(...)");
                eVar4.a(typeToken, authenticationResultDeserializer);
                TypeToken typeToken2 = new TypeToken(y02.a.class);
                Intrinsics.checkNotNullExpressionValue(typeToken2, "get(...)");
                eVar4.a(typeToken2, trackingSettingsResponseAdapter);
                TypeToken typeToken3 = new TypeToken(qr1.v.class);
                Intrinsics.checkNotNullExpressionValue(typeToken3, "get(...)");
                eVar4.a(typeToken3, multiFactorDataResponseJsonDeserializableAdapter);
                TypeToken typeToken4 = new TypeToken(String.class);
                Intrinsics.checkNotNullExpressionValue(typeToken4, "get(...)");
                eVar4.a(typeToken4, accessTokenDataResponseJsonDeserializableAdapter);
                TypeToken typeToken5 = new TypeToken(vd0.c.class);
                Intrinsics.checkNotNullExpressionValue(typeToken5, "get(...)");
                eVar4.a(typeToken5, fVar);
                TypeToken a13 = TypeToken.a(new TypeToken(List.class).f33846a, new TypeToken(qr1.a0.class).f33847b);
                Intrinsics.checkNotNullExpressionValue(a13, "getParameterized(...)");
                eVar4.a(a13, dr1.h.f56214a);
                return eVar4;
            case 339:
                return new n12.a((CollaboratorInviteDeserializer) oaVar.M6.get());
            case 340:
                return new CollaboratorInviteDeserializer((ModelDeserializerWithSaveAndMerge) oaVar.f113905s3.get());
            case 341:
                j80.a carouselIndexLookup = (j80.a) oaVar.O6.get();
                Intrinsics.checkNotNullParameter(carouselIndexLookup, "carouselIndexLookup");
                return new es.c(carouselIndexLookup);
            case 342:
                return new j80.b();
            case 343:
                return new es.v((lh0.d) oaVar.Q6.get(), (es.a) oaVar.P6.get(), (ws1.a) oaVar.R6.get(), (np1.a) oaVar.Z6.get(), (z82.c) oaVar.f113699g7.get(), (hf0.b) oaVar.f113717h7.get(), (tb0.h) oaVar.f113797m0.get());
            case 344:
                return new lh0.d((lh0.z0) oaVar.D0.get());
            case 345:
                return ws1.b.f131081a;
            case 346:
                np1.j handshakeManager = (np1.j) oaVar.Y6.get();
                Intrinsics.checkNotNullParameter(handshakeManager, "handshakeManager");
                return new np1.a(handshakeManager);
            case 347:
                rp1.d handshakeCookieManager = (rp1.d) oaVar.T6.get();
                IHandshakeRemoteDataSource handshakeRemoteRemoteDataSource = (IHandshakeRemoteDataSource) oaVar.X6.get();
                lv.a adsQuarantine = (lv.a) oaVar.S6.get();
                mp1.l handshakeAnalytics = (mp1.l) oaVar.W6.get();
                lh0.o1 experiment = new lh0.o1((lh0.z0) oaVar.D0.get());
                ao2.j0 applicationScope = (ao2.j0) oaVar.G0.get();
                Intrinsics.checkNotNullParameter(handshakeCookieManager, "handshakeCookieManager");
                Intrinsics.checkNotNullParameter(handshakeRemoteRemoteDataSource, "handshakeRemoteRemoteDataSource");
                Intrinsics.checkNotNullParameter(adsQuarantine, "adsQuarantine");
                Intrinsics.checkNotNullParameter(handshakeAnalytics, "handshakeAnalytics");
                Intrinsics.checkNotNullParameter(experiment, "experiment");
                Intrinsics.checkNotNullParameter(applicationScope, "applicationScope");
                return new np1.i(handshakeCookieManager, handshakeRemoteRemoteDataSource, adsQuarantine, handshakeAnalytics, experiment, applicationScope);
            case 348:
                lv.a adsQuarantine2 = (lv.a) oaVar.S6.get();
                Intrinsics.checkNotNullParameter(adsQuarantine2, "adsQuarantine");
                return new rp1.d(adsQuarantine2, Build.VERSION.SDK_INT);
            case 349:
                m60.f0 f0Var = oaVar.f113620c;
                Context context2 = (Context) oaVar.f113902s0.get();
                f0Var.getClass();
                Intrinsics.checkNotNullParameter(context2, "context");
                return new lv.a(context2);
            case 350:
                HandshakeApiClientService retrofit = (HandshakeApiClientService) oaVar.V6.get();
                mp1.l handshakeAnalytics2 = (mp1.l) oaVar.W6.get();
                b60.b activeUserManager = (b60.b) oaVar.f113850p0.get();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Intrinsics.checkNotNullParameter(handshakeAnalytics2, "handshakeAnalytics");
                Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
                return new HandshakeRemoteRemoteDataSource(retrofit, handshakeAnalytics2, activeUserManager);
            case 351:
                pq2.c1 retrofit3 = (pq2.c1) oaVar.f113623c2.get();
                rz.c adapterFactory2 = (rz.c) oaVar.f114011y1.get();
                rq2.a gsonConverterFactory2 = oaVar.J2();
                rz.e eVar5 = (rz.e) oaVar.U6.get();
                p00.b converterFactory = new p00.b(eVar5, n60.o.k(eVar5, "registry", "bodyConverter"), null);
                Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                Intrinsics.checkNotNullParameter(adapterFactory2, "adapterFactory");
                Intrinsics.checkNotNullParameter(gsonConverterFactory2, "gsonConverterFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                retrofit3.a(adapterFactory2);
                retrofit3.b(converterFactory);
                HandshakeApiClientService handshakeApiClientService = (HandshakeApiClientService) n60.o.h(retrofit3, gsonConverterFactory2, HandshakeApiClientService.class, "create(...)");
                dl2.b.I(handshakeApiClientService);
                return handshakeApiClientService;
            case 352:
                rz.e eVar6 = new rz.e();
                eVar6.a(n60.o.f(com.pinterest.api.model.z.class, "get(...)"), new sz.b(0));
                TypeToken typeToken6 = new TypeToken(com.pinterest.api.model.n1.class);
                Intrinsics.checkNotNullExpressionValue(typeToken6, "get(...)");
                eVar6.a(typeToken6, new sz.b(2));
                TypeToken typeToken7 = new TypeToken(com.pinterest.api.model.j1.class);
                Intrinsics.checkNotNullExpressionValue(typeToken7, "get(...)");
                eVar6.a(typeToken7, new sz.b(1));
                return eVar6;
            case 353:
                nx.d0 pinalytics = (nx.d0) oaVar.f113817n2.get();
                mp1.c handshakeEventGenerator = new mp1.c(new mp1.a(oaVar.X1(), new lh0.o1((lh0.z0) oaVar.D0.get())));
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                Intrinsics.checkNotNullParameter(handshakeEventGenerator, "handshakeEventGenerator");
                return new mp1.b(pinalytics, handshakeEventGenerator);
            case 354:
                z82.b handshakeManager2 = (z82.b) oaVar.f113681f7.get();
                Intrinsics.checkNotNullParameter(handshakeManager2, "handshakeManager");
                return new z82.c(handshakeManager2);
            case 355:
                e92.d handshakeCookieManager2 = (e92.d) oaVar.f113593a7.get();
                a92.a handshakeRemoteRemoteDataSource2 = (a92.a) oaVar.f113663e7.get();
                lv.a adsQuarantine3 = (lv.a) oaVar.S6.get();
                y82.h handshakeAnalytics3 = (y82.h) oaVar.f113645d7.get();
                lh0.g4 experiment2 = oaVar.c3();
                ao2.j0 applicationScope2 = (ao2.j0) oaVar.G0.get();
                Intrinsics.checkNotNullParameter(handshakeCookieManager2, "handshakeCookieManager");
                Intrinsics.checkNotNullParameter(handshakeRemoteRemoteDataSource2, "handshakeRemoteRemoteDataSource");
                Intrinsics.checkNotNullParameter(adsQuarantine3, "adsQuarantine");
                Intrinsics.checkNotNullParameter(handshakeAnalytics3, "handshakeAnalytics");
                Intrinsics.checkNotNullParameter(experiment2, "experiment");
                Intrinsics.checkNotNullParameter(applicationScope2, "applicationScope");
                return new z82.j(handshakeCookieManager2, handshakeRemoteRemoteDataSource2, adsQuarantine3, handshakeAnalytics3, experiment2, applicationScope2);
            case 356:
                lv.a adsQuarantine4 = (lv.a) oaVar.S6.get();
                lh0.g4 experiments = oaVar.c3();
                Intrinsics.checkNotNullParameter(adsQuarantine4, "adsQuarantine");
                Intrinsics.checkNotNullParameter(experiments, "experiments");
                return new e92.d(adsQuarantine4, Build.VERSION.SDK_INT, experiments);
            case 357:
                a92.b retrofit4 = (a92.b) oaVar.f113628c7.get();
                y82.h handshakeAnalytics4 = (y82.h) oaVar.f113645d7.get();
                b60.b activeUserManager2 = (b60.b) oaVar.f113850p0.get();
                Intrinsics.checkNotNullParameter(retrofit4, "retrofit");
                Intrinsics.checkNotNullParameter(handshakeAnalytics4, "handshakeAnalytics");
                Intrinsics.checkNotNullParameter(activeUserManager2, "activeUserManager");
                return new a92.h(retrofit4, handshakeAnalytics4, activeUserManager2);
            case 358:
                pq2.c1 retrofit5 = (pq2.c1) oaVar.f113623c2.get();
                rz.c adapterFactory3 = (rz.c) oaVar.f114011y1.get();
                rq2.a gsonConverterFactory3 = oaVar.J2();
                rz.e eVar7 = (rz.e) oaVar.f113611b7.get();
                p00.b converterFactory2 = new p00.b(eVar7, n60.o.k(eVar7, "registry", "bodyConverter"), null);
                Intrinsics.checkNotNullParameter(retrofit5, "retrofit");
                Intrinsics.checkNotNullParameter(adapterFactory3, "adapterFactory");
                Intrinsics.checkNotNullParameter(gsonConverterFactory3, "gsonConverterFactory");
                Intrinsics.checkNotNullParameter(converterFactory2, "converterFactory");
                retrofit5.a(adapterFactory3);
                retrofit5.b(converterFactory2);
                a92.b bVar2 = (a92.b) n60.o.h(retrofit5, gsonConverterFactory3, a92.b.class, "create(...)");
                dl2.b.I(bVar2);
                return bVar2;
            case 359:
                rz.e eVar8 = new rz.e();
                eVar8.a(n60.o.f(com.pinterest.api.model.z.class, "get(...)"), new sz.b(0));
                TypeToken typeToken8 = new TypeToken(com.pinterest.api.model.n1.class);
                Intrinsics.checkNotNullExpressionValue(typeToken8, "get(...)");
                eVar8.a(typeToken8, new sz.b(2));
                TypeToken typeToken9 = new TypeToken(com.pinterest.api.model.j1.class);
                Intrinsics.checkNotNullExpressionValue(typeToken9, "get(...)");
                eVar8.a(typeToken9, new sz.b(1));
                return eVar8;
            case 360:
                nx.d0 pinalytics2 = (nx.d0) oaVar.f113817n2.get();
                m60.f0 handshakeEventGenerator2 = new m60.f0();
                y82.a adsTargetAccountLinkingLogger = new y82.a(oaVar.X1(), oaVar.c3());
                Intrinsics.checkNotNullParameter(pinalytics2, "pinalytics");
                Intrinsics.checkNotNullParameter(handshakeEventGenerator2, "handshakeEventGenerator");
                Intrinsics.checkNotNullParameter(adsTargetAccountLinkingLogger, "adsTargetAccountLinkingLogger");
                return new y82.i(pinalytics2, handshakeEventGenerator2, adsTargetAccountLinkingLogger);
            case 361:
                return new hf0.b();
            case 362:
                mc.i iVar = new mc.i();
                uk2.o oVar = new uk2.o();
                Intrinsics.checkNotNullExpressionValue(oVar, "create(...)");
                iVar.f86902a = oVar;
                return iVar;
            case 363:
                lh0.z0 experimentsActivator = (lh0.z0) oaVar.D0.get();
                Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
                return new lh0.o(experimentsActivator);
            case 364:
                g10.a defaultOkHttpInterceptorSource = (g10.a) oaVar.f113787l7.get();
                Intrinsics.checkNotNullParameter(defaultOkHttpInterceptorSource, "defaultOkHttpInterceptorSource");
                dl2.b.I(defaultOkHttpInterceptorSource);
                return defaultOkHttpInterceptorSource;
            case 365:
                return new g10.a(new m60.f0(), (b60.b) oaVar.f113850p0.get());
            case 366:
                return new jp1.b((m60.w) oaVar.f113885r0.get(), (qb0.e) oaVar.f113869q1.get());
            case 367:
                return new kn.c(1);
            case 368:
                return new GoogleEngageBroadcastReceiver();
            case 369:
                return new ip1.b((b60.b) oaVar.f113850p0.get(), oaVar.f113945u7, oaVar.G7);
            case 370:
                return new my1.c((x02.x2) oaVar.f113800m3.get(), (hs1.q) oaVar.f113875q7.get(), oa.r0(oaVar), (b60.b) oaVar.f113850p0.get(), oaVar.W2());
            case 371:
                hs1.q a14 = hs1.t.a();
                dl2.b.I(a14);
                return a14;
            case 372:
                return new wj0.a();
            case 373:
                pq2.d1 retrofit6 = (pq2.d1) oaVar.f113909s7.get();
                Intrinsics.checkNotNullParameter(retrofit6, "retrofit");
                Object b14 = retrofit6.b(x12.a.class);
                Intrinsics.checkNotNullExpressionValue(b14, "create(...)");
                x12.a aVar = (x12.a) b14;
                dl2.b.I(aVar);
                return aVar;
            case 374:
                pq2.c1 retrofit7 = (pq2.c1) oaVar.f113623c2.get();
                rz.c adapterFactory4 = (rz.c) oaVar.f114011y1.get();
                rq2.a gsonConverterFactory4 = oaVar.J2();
                p00.d dVar = new p00.d();
                rz.e eVar9 = (rz.e) oaVar.f113714h4.get();
                a02.e.r3(eVar9);
                p00.b converterFactory3 = a02.e.O4(eVar9, dVar);
                Intrinsics.checkNotNullParameter(retrofit7, "retrofit");
                Intrinsics.checkNotNullParameter(adapterFactory4, "adapterFactory");
                Intrinsics.checkNotNullParameter(gsonConverterFactory4, "gsonConverterFactory");
                Intrinsics.checkNotNullParameter(converterFactory3, "converterFactory");
                retrofit7.a(adapterFactory4);
                retrofit7.b(converterFactory3);
                retrofit7.b(gsonConverterFactory4);
                pq2.d1 d2 = retrofit7.d();
                Intrinsics.checkNotNullExpressionValue(d2, "build(...)");
                return d2;
            case 375:
                return new my1.f((hs1.q) oaVar.f113875q7.get(), (b60.b) oaVar.f113850p0.get(), (lb0.q) oaVar.O0.get(), (c61.p0) oaVar.f113963v7.get(), com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ac2.o1) oaVar.C7.get(), (bc2.e) oaVar.F7.get(), (lh0.n1) oaVar.E0.get());
            case 376:
                pq2.d1 retrofit8 = (pq2.d1) oaVar.W3.get();
                Intrinsics.checkNotNullParameter(retrofit8, "retrofit");
                Object b15 = retrofit8.b(c61.p0.class);
                Intrinsics.checkNotNullExpressionValue(b15, "create(...)");
                c61.p0 p0Var = (c61.p0) b15;
                dl2.b.I(p0Var);
                return p0Var;
            case 377:
                l8.e eVar10 = (l8.e) oaVar.P0.get();
                vy.m mVar = (vy.m) oaVar.M1.get();
                nx.d0 d0Var = (nx.d0) oaVar.f113817n2.get();
                ps0.m mVar2 = oaVar.f113638d;
                qc2.d y23 = com.pinterest.widget.configuration.k.y2(mVar2);
                lh0.k4 k4Var = (lh0.k4) oaVar.Q0.get();
                com.pinterest.widget.configuration.k.x2(mVar2);
                ac2.f videoManagerUtil = ac2.f.f1945a;
                ac2.k kVar = (ac2.k) oaVar.f113981w7.get();
                ac2.f1 f1Var = (ac2.f1) oaVar.f113640d1.get();
                m60.b0 t13 = com.pinterest.widget.configuration.k.t();
                com.pinterest.widget.configuration.k.x2(mVar2);
                Intrinsics.checkNotNullParameter(videoManagerUtil, "videoManagerUtil");
                return new ac2.o1(eVar10, mVar, d0Var, y23, k4Var, kVar, f1Var, t13, new nc2.f(), (dc2.m) oaVar.f114017y7.get(), oa.X0(oaVar), (hc2.d) oaVar.A7.get(), new jc2.c(), (ey.k3) oaVar.f113873q5.get(), (lb0.q) oaVar.O0.get(), (hc2.g) oaVar.Y0.get(), (ac2.h1) oaVar.B7.get());
            case 378:
                Context context3 = (Context) oaVar.f113902s0.get();
                Application application = com.pinterest.widget.configuration.k.h(oaVar.f113603b);
                oaVar.f113638d.getClass();
                Intrinsics.checkNotNullParameter(application, "application");
                Object systemService = application.getSystemService("audio");
                Intrinsics.g(systemService, "null cannot be cast to non-null type android.media.AudioManager");
                return new ac2.b(context3, (AudioManager) systemService);
            case 379:
                return new dc2.m((dc2.e) oaVar.f113675f1.get(), (pb0.a) oaVar.f113834o1.get(), (ac2.n0) oaVar.f113999x7.get(), (hc2.g) oaVar.Y0.get(), (ac2.f1) oaVar.f113640d1.get(), (lb0.q) oaVar.O0.get());
            case 380:
                return new ac2.n0();
            case 381:
                return new hc2.d((ac2.l) oaVar.f114017y7.get(), new b20.c((a.cb) null), (hc2.p) oaVar.f114035z7.get(), (lh0.k4) oaVar.Q0.get());
            case 382:
                return new hc2.p();
            case 383:
                lh0.z0 experimentsActivator2 = (lh0.z0) oaVar.D0.get();
                Intrinsics.checkNotNullParameter(experimentsActivator2, "experimentsActivator");
                return new ac2.h1(experimentsActivator2);
            case 384:
                return new nc2.e((bc2.b) oaVar.D7.get(), (tb0.h) oaVar.f113797m0.get(), (lh0.k4) oaVar.Q0.get(), (l5.i) oaVar.E7.get(), (l8.e) oaVar.P0.get());
            case 385:
                nc2.d dVar2 = new nc2.d();
                dVar2.f90391a = new nc2.a();
                return dVar2;
            case 386:
                m60.f0 f0Var2 = oaVar.f113655e;
                Context context4 = (Context) oaVar.f113902s0.get();
                f0Var2.getClass();
                Intrinsics.checkNotNullParameter(context4, "context");
                return new l5.i(context4);
            case 387:
                return new a11.b0((Context) oaVar.f113902s0.get(), (lb0.o) oaVar.f114010y0.get());
            case 388:
                return new u9(this, 0);
            case 389:
                return new lo1.a((b60.b) oaVar.f113850p0.get(), oaVar.X2());
            case 390:
                return new v9(this, 0);
            case 391:
                return new gp1.l((lh0.n1) oaVar.E0.get(), (lb0.q) oaVar.O0.get());
            case 392:
                return new u9(this, 1);
            case 393:
                pq2.c1 c1Var2 = (pq2.c1) oaVar.f113623c2.get();
                p00.b bVar3 = (p00.b) oaVar.O7.get();
                rz.c adapterFactory5 = (rz.c) oaVar.f114011y1.get();
                rq2.a gsonConverterFactory5 = n60.o.n(oaVar, c1Var2, "retrofit", bVar3, "converterFactory");
                Intrinsics.checkNotNullParameter(adapterFactory5, "adapterFactory");
                Intrinsics.checkNotNullParameter(gsonConverterFactory5, "gsonConverterFactory");
                pq2.c1 j14 = df.j1.j(c1Var2, rz.c.b(adapterFactory5, null, null, false, 47));
                j14.b(bVar3);
                j14.b(gsonConverterFactory5);
                Object b16 = j14.d().b(h22.f.class);
                Intrinsics.checkNotNullExpressionValue(b16, "create(...)");
                h22.f fVar2 = (h22.f) b16;
                dl2.b.I(fVar2);
                return fVar2;
            case 394:
                rz.e eVar11 = (rz.e) oaVar.N7.get();
                return new p00.b(eVar11, n60.o.k(eVar11, "registry", "bodyConverter"), null);
            case 395:
                PinDeserializer pinDeserializer = (PinDeserializer) oaVar.W2.get();
                Intrinsics.checkNotNullParameter(pinDeserializer, "pinDeserializer");
                rz.e eVar12 = new rz.e();
                eVar12.a(n60.o.f(cm0.class, "get(...)"), j00.a.f73962a);
                TypeToken typeToken10 = new TypeToken(f30.class);
                Intrinsics.checkNotNullExpressionValue(typeToken10, "get(...)");
                eVar12.a(typeToken10, new e00.a(pinDeserializer));
                TypeToken typeToken11 = new TypeToken(vd0.c.class);
                Intrinsics.checkNotNullExpressionValue(typeToken11, "get(...)");
                eVar12.a(typeToken11, fVar);
                return eVar12;
            case 396:
                PinDeserializer pinDeserializer2 = (PinDeserializer) oaVar.W2.get();
                b22.b pinFeedDeserializableAdapter = (b22.b) oaVar.Y2.get();
                Intrinsics.checkNotNullParameter(pinDeserializer2, "pinDeserializer");
                Intrinsics.checkNotNullParameter(pinFeedDeserializableAdapter, "pinFeedDeserializableAdapter");
                rz.e eVar13 = new rz.e();
                TypeToken typeToken12 = new TypeToken(vd0.c.class);
                Intrinsics.checkNotNullExpressionValue(typeToken12, "get(...)");
                eVar13.a(typeToken12, fVar);
                return eVar13;
            case 397:
                return new ag1.b((dl1.t) oaVar.Y7.get(), (vy.m) oaVar.M1.get(), (b60.b) oaVar.f113850p0.get(), (tb0.h) oaVar.f113797m0.get(), (Context) oaVar.f113902s0.get());
            case 398:
                i22.d storyPinLocalDataRepository = (i22.d) oaVar.X7.get();
                Intrinsics.checkNotNullParameter(storyPinLocalDataRepository, "storyPinLocalDataRepository");
                dl2.b.I(storyPinLocalDataRepository);
                return storyPinLocalDataRepository;
            case 399:
                dl1.p localDataSource = (dl1.p) oaVar.T7.get();
                dl1.a0 remoteDataSource = (dl1.a0) oaVar.U7.get();
                dl1.z persistencePolicy = (dl1.z) oaVar.V7.get();
                gl1.d repositorySchedulerPolicy = (gl1.d) oaVar.W7.get();
                Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
                Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
                Intrinsics.checkNotNullParameter(persistencePolicy, "persistencePolicy");
                Intrinsics.checkNotNullParameter(repositorySchedulerPolicy, "repositorySchedulerPolicy");
                return new i22.d(localDataSource, remoteDataSource, persistencePolicy, repositorySchedulerPolicy, null, null, null, null, null, null, null, null, null, null, 32752);
            default:
                throw new AssertionError(i13);
        }
    }

    public final Object e() {
        rz.f fVar = rz.f.f110230a;
        oa oaVar = this.f113568a;
        int i13 = this.f113569b;
        switch (i13) {
            case 400:
                return new i22.b((lb0.o) oaVar.f113780l0.get(), (b60.b) oaVar.f113850p0.get(), (de0.d) oaVar.S7.get(), (lb0.r) oaVar.f113622c1.get());
            case 401:
                return com.pinterest.widget.configuration.k.u0((nx.d0) oaVar.f113817n2.get(), (tb0.h) oaVar.f113797m0.get(), (xd0.f) oaVar.R7.get());
            case 402:
                return com.pinterest.widget.configuration.k.a((PinterestDatabase) oaVar.R5.get());
            case 403:
                return new i22.c();
            case 404:
                fl1.a aVar = (fl1.a) oaVar.T2.get();
                com.pinterest.widget.configuration.k.U(aVar);
                return aVar;
            case 405:
                return com.pinterest.widget.configuration.k.Y();
            case 406:
                return new ag1.f();
            case 407:
                return new bw0.f((bw0.c) oaVar.f113612b8.get(), (bw0.i) oaVar.f113629c8.get(), (bw0.l) oaVar.f113646d8.get(), (bw0.j) oaVar.f113664e8.get(), (bw0.k) oaVar.f113682f8.get(), (bw0.o) oaVar.f113700g8.get(), (ag1.b) oaVar.Z7.get(), (tb0.h) oaVar.f113797m0.get(), (lh0.s1) oaVar.f113718h8.get());
            case 408:
                return new bw0.c();
            case 409:
                return new bw0.i((bw0.c) oaVar.f113612b8.get());
            case 410:
                return new bw0.l((bw0.c) oaVar.f113612b8.get());
            case 411:
                return new bw0.j((bw0.c) oaVar.f113612b8.get());
            case 412:
                return new bw0.k((bw0.c) oaVar.f113612b8.get());
            case 413:
                return new bw0.o((bw0.j) oaVar.f113664e8.get(), (bw0.c) oaVar.f113612b8.get());
            case 414:
                return new lh0.s1((lh0.z0) oaVar.D0.get());
            case 415:
                return new u9(this, 2);
            case 416:
                return new v9(this, 1);
            case 417:
                return com.pinterest.widget.configuration.k.h0((u00.a) oaVar.f113890r5.get());
            case 418:
                return new u9(this, 3);
            case 419:
                return new u9(this, 4);
            case 420:
                return new sv0.l((o20.b) oaVar.f113841o8.get(), (o20.a) oaVar.f113858p8.get(), (bw0.f) oaVar.f113736i8.get(), (Context) oaVar.f113902s0.get(), (fe0.b) oaVar.f113893r8.get(), (uj2.q) oaVar.f113910s8.get(), (ag1.b) oaVar.Z7.get(), (tb0.h) oaVar.f113797m0.get());
            case 421:
                pq2.c1 c1Var = (pq2.c1) oaVar.f113623c2.get();
                return a02.e.T2((rz.c) oaVar.f114011y1.get(), oa.l1(oaVar), c1Var, oaVar.J2());
            case 422:
                pq2.c1 c1Var2 = (pq2.c1) oaVar.f113623c2.get();
                return a02.e.S2((rz.c) oaVar.f114011y1.get(), a02.e.O2(a02.e.Q2(), new p00.d()), c1Var2, oaVar.J2());
            case 423:
                ce0.a networkSpeedDao = (ce0.a) oaVar.f113876q8.get();
                Intrinsics.checkNotNullParameter(networkSpeedDao, "networkSpeedDao");
                return new fe0.b(networkSpeedDao);
            case 424:
                PinterestDatabase pinterestDatabase = (PinterestDatabase) oaVar.R5.get();
                Intrinsics.checkNotNullParameter(pinterestDatabase, "pinterestDatabase");
                ce0.a w13 = pinterestDatabase.w();
                dl2.b.I(w13);
                return w13;
            case 425:
                xu1.y networkTypeMonitor = (xu1.y) oaVar.I0.get();
                Intrinsics.checkNotNullParameter(networkTypeMonitor, "networkTypeMonitor");
                networkTypeMonitor.getClass();
                return xu1.y.c();
            case 426:
                return new u9(this, 5);
            case 427:
                return new u9(this, 6);
            case 428:
                return new nt0.d((Context) oaVar.f113902s0.get(), (h22.f) oaVar.P7.get(), (tb0.h) oaVar.f113797m0.get());
            case 429:
                zf1.e eVar = new zf1.e();
                eVar.f141925a = (Context) oaVar.f113902s0.get();
                eVar.f141926b = (h22.f) oaVar.P7.get();
                eVar.f141927c = (ee0.b) oaVar.f114018y8.get();
                return eVar;
            case 430:
                zd0.d fontDao = (zd0.d) oaVar.f114000x8.get();
                Intrinsics.checkNotNullParameter(fontDao, "fontDao");
                return new ee0.b(fontDao);
            case 431:
                PinterestDatabase pinterestDatabase2 = (PinterestDatabase) oaVar.R5.get();
                Intrinsics.checkNotNullParameter(pinterestDatabase2, "pinterestDatabase");
                zd0.d t13 = pinterestDatabase2.t();
                dl2.b.I(t13);
                return t13;
            case 432:
                return new u9(this, 7);
            case 433:
                return new u9(this, 8);
            case 434:
                return new u9(this, 9);
            case 435:
                pq2.c1 c1Var3 = (pq2.c1) oaVar.f113623c2.get();
                p00.b bVar = (p00.b) oaVar.E8.get();
                rz.c adapterFactory = (rz.c) oaVar.f114011y1.get();
                rq2.a gsonConverterFactory = n60.o.n(oaVar, c1Var3, "retrofit", bVar, "converterFactory");
                Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
                Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
                pq2.c1 j13 = df.j1.j(c1Var3, rz.c.b(adapterFactory, null, null, false, 47));
                j13.b(bVar);
                j13.b(gsonConverterFactory);
                Object b13 = j13.d().b(m20.b.class);
                Intrinsics.checkNotNullExpressionValue(b13, "create(...)");
                m20.b bVar2 = (m20.b) b13;
                dl2.b.I(bVar2);
                return bVar2;
            case 436:
                rz.e eVar2 = (rz.e) oaVar.D8.get();
                return new p00.b(eVar2, n60.o.k(eVar2, "registry", "bodyConverter"), null);
            case 437:
                rz.e eVar3 = new rz.e();
                eVar3.a(n60.o.f(q40.class, "get(...)"), m20.a.f85692a);
                return eVar3;
            case 438:
                return new u9(this, 10);
            case 439:
                return new v9(this, 2);
            case 440:
                return new u9(this, 11);
            case 441:
                OkHttpClient okHttpClient = (OkHttpClient) oaVar.f113956v0.get();
                pq2.c1 retrofit = (pq2.c1) oaVar.f113623c2.get();
                rq2.a gsonConverterFactory2 = oaVar.J2();
                Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Intrinsics.checkNotNullParameter(gsonConverterFactory2, "gsonConverterFactory");
                OkHttpClient.Builder newBuilder = okHttpClient.newBuilder();
                newBuilder.c(30L, TimeUnit.SECONDS);
                TimeUnit timeUnit = TimeUnit.MINUTES;
                newBuilder.e(1L, timeUnit);
                newBuilder.f(1L, timeUnit);
                OkHttpClient okHttpClient2 = new OkHttpClient(newBuilder);
                retrofit.getClass();
                retrofit.f101001a = okHttpClient2;
                v20.a aVar2 = (v20.a) n60.o.h(retrofit, gsonConverterFactory2, v20.a.class, "create(...)");
                dl2.b.I(aVar2);
                return aVar2;
            case 442:
                ag1.h hVar = new ag1.h();
                hVar.f15145a = new ag1.k();
                return hVar;
            case 443:
                return new u9(this, 12);
            case 444:
                pq2.c1 c1Var4 = (pq2.c1) oaVar.f113623c2.get();
                p00.b bVar3 = (p00.b) oaVar.N8.get();
                rz.c adapterFactory2 = (rz.c) oaVar.f114011y1.get();
                rq2.a n13 = n60.o.n(oaVar, c1Var4, "retrofit", bVar3, "converterFactory");
                Intrinsics.checkNotNullParameter(adapterFactory2, "adapterFactory");
                n60.o.u(n13, "gsonConverterFactory", c1Var4, adapterFactory2, bVar3);
                t20.a aVar3 = (t20.a) n60.o.h(c1Var4, n13, t20.a.class, "create(...)");
                dl2.b.I(aVar3);
                return aVar3;
            case 445:
                rz.e eVar4 = (rz.e) oaVar.M8.get();
                return new p00.b(eVar4, n60.o.k(eVar4, "registry", "bodyConverter"), null);
            case 446:
                PinDeserializer pinDeserializer = (PinDeserializer) oaVar.W2.get();
                Intrinsics.checkNotNullParameter(pinDeserializer, "pinDeserializer");
                rz.e eVar5 = new rz.e();
                eVar5.a(n60.o.f(f30.class, "get(...)"), new e00.a(pinDeserializer));
                TypeToken typeToken = new TypeToken(vd0.c.class);
                Intrinsics.checkNotNullExpressionValue(typeToken, "get(...)");
                eVar5.a(typeToken, fVar);
                return eVar5;
            case 447:
                return new y42.f(com.pinterest.widget.configuration.k.h(oaVar.f113603b), (m60.w) oaVar.f113885r0.get(), (lu1.b) oaVar.f113961v5.get(), oa.f1(oaVar));
            case 448:
                return new nx.b0((vr.a) oaVar.Q8.get(), (es.a) oaVar.P6.get());
            case 449:
                return new vr.b((nx.d0) oaVar.f113817n2.get(), (lh0.d) oaVar.Q6.get(), (b60.b) oaVar.f113850p0.get(), (es.a) oaVar.P6.get(), (es.h) oaVar.f113735i7.get());
            case 450:
                return new u9(this, 13);
            case 451:
                return new com.pinterest.widget.configuration.h();
            case 452:
                pb0.a clock = (pb0.a) oaVar.f113834o1.get();
                nx.d0 pinalytics = (nx.d0) oaVar.f113817n2.get();
                lh0.g1 experimentsManager = (lh0.g1) oaVar.D0.get();
                lb0.q prefsManagerPersisted = (lb0.q) oaVar.O0.get();
                zr.b adsSystemUtils = (zr.b) oaVar.W8.get();
                jw.b powerscoreExperimentManager = (jw.b) oaVar.Y8.get();
                fw.d adsGmaLogger = (fw.d) oaVar.Z8.get();
                Intrinsics.checkNotNullParameter(clock, "clock");
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                Intrinsics.checkNotNullParameter(experimentsManager, "experimentsManager");
                Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
                Intrinsics.checkNotNullParameter(adsSystemUtils, "adsSystemUtils");
                Intrinsics.checkNotNullParameter(powerscoreExperimentManager, "powerscoreExperimentManager");
                Intrinsics.checkNotNullParameter(adsGmaLogger, "adsGmaLogger");
                return new hw.a(clock, pinalytics, experimentsManager, prefsManagerPersisted, adsSystemUtils, powerscoreExperimentManager, adsGmaLogger);
            case 453:
                Context context = oaVar.f113603b.f67746a;
                dl2.b.I(context);
                return new zr.b(context, (zr.a) oaVar.V8.get());
            case 454:
                Context context2 = oaVar.f113603b.f67746a;
                dl2.b.I(context2);
                return new zr.a(context2);
            case 455:
                lh0.i adsGmaLibraryExperiments = oa.f0(oaVar);
                lh0.z0 experimentsActivator = (lh0.z0) oaVar.D0.get();
                zr.b adsSystemUtils2 = (zr.b) oaVar.W8.get();
                iz1.a powerscoreManager = (iz1.a) oaVar.X8.get();
                Intrinsics.checkNotNullParameter(adsGmaLibraryExperiments, "adsGmaLibraryExperiments");
                Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
                Intrinsics.checkNotNullParameter(adsSystemUtils2, "adsSystemUtils");
                Intrinsics.checkNotNullParameter(powerscoreManager, "powerscoreManager");
                return new jw.b(adsGmaLibraryExperiments, experimentsActivator, adsSystemUtils2, powerscoreManager);
            case 456:
                return new iz1.a((kz1.a) oaVar.D6.get(), (lh0.z0) oaVar.D0.get(), (lb0.o) oaVar.f113780l0.get());
            case 457:
                wr.d adFormatsLogger = oaVar.X1();
                lh0.i adsGmaLibraryExperiments2 = oa.f0(oaVar);
                zr.b adsSystemUtils3 = (zr.b) oaVar.W8.get();
                Intrinsics.checkNotNullParameter(adFormatsLogger, "adFormatsLogger");
                Intrinsics.checkNotNullParameter(adsGmaLibraryExperiments2, "adsGmaLibraryExperiments");
                Intrinsics.checkNotNullParameter(adsSystemUtils3, "adsSystemUtils");
                return new fw.d(adFormatsLogger, adsGmaLibraryExperiments2, adsSystemUtils3);
            case 458:
                return new tu1.q((tu1.i) oaVar.f113613b9.get(), (tu1.d0) oaVar.f113711h1.get(), (List) oaVar.K0.get());
            case 459:
                Context context3 = oaVar.f113603b.f67746a;
                dl2.b.I(context3);
                gz1.b playServices = (gz1.b) oaVar.C1.get();
                Intrinsics.checkNotNullParameter(context3, "context");
                Intrinsics.checkNotNullParameter(playServices, "playServices");
                return new tu1.i(context3, playServices);
            case 460:
                return new tu1.s((tu1.g0) oaVar.N0.get(), (tu1.d0) oaVar.f113711h1.get(), (List) oaVar.K0.get());
            case 461:
                return new vu1.z((tu1.g0) oaVar.N0.get(), (tu1.d0) oaVar.f113711h1.get(), (su1.i) oaVar.f113781l1.get(), (List) oaVar.K0.get());
            case 462:
                return ey.g3.f60489a;
            case 463:
                return new ey.c3();
            case 464:
                com.pinterest.feature.home.model.k kVar = (com.pinterest.feature.home.model.k) oaVar.f113771k9.get();
                com.pinterest.feature.home.model.k kVar2 = (com.pinterest.feature.home.model.k) oaVar.f113789l9.get();
                m60.h0 h0Var = (m60.h0) oaVar.f113806m9.get();
                uj2.a0 a0Var = (uj2.a0) oaVar.Y3.get();
                uj2.a0 a0Var2 = (uj2.a0) oaVar.Z3.get();
                qb0.e eVar6 = (qb0.e) oaVar.f113869q1.get();
                ey.j3 j3Var = ey.j3.f60510a;
                return new com.pinterest.feature.home.model.f(new com.pinterest.feature.home.model.j(kVar, kVar2, h0Var, a0Var, a0Var2, eVar6, (ey.k3) oaVar.f113873q5.get(), (hs1.q) oaVar.f113875q7.get(), (ac2.i) oaVar.R0.get(), (ew.l) oaVar.f113877q9.get(), (ds.a) oaVar.f113894r9.get(), (lh0.n1) oaVar.E0.get(), oaVar.e2()), new com.pinterest.feature.home.model.a(), new com.pinterest.feature.home.model.c(), (m60.h0) oaVar.f113806m9.get(), (tb0.h) oaVar.f113797m0.get(), (lh0.n1) oaVar.E0.get());
            case 465:
                pq2.c1 c1Var5 = (pq2.c1) oaVar.f113623c2.get();
                p00.b bVar4 = (p00.b) oaVar.f113754j9.get();
                rz.c adapterFactory3 = (rz.c) oaVar.f114011y1.get();
                rq2.a n14 = n60.o.n(oaVar, c1Var5, "retrofit", bVar4, "converterFactory");
                Intrinsics.checkNotNullParameter(adapterFactory3, "adapterFactory");
                n60.o.u(n14, "gsonConverterFactory", c1Var5, adapterFactory3, bVar4);
                com.pinterest.feature.home.model.k kVar3 = (com.pinterest.feature.home.model.k) n60.o.h(c1Var5, n14, com.pinterest.feature.home.model.k.class, "create(...)");
                dl2.b.I(kVar3);
                return kVar3;
            case 466:
                rz.e eVar7 = (rz.e) oaVar.f113737i9.get();
                return new p00.b(eVar7, n60.o.k(eVar7, "registry", "bodyConverter"), null);
            case 467:
                a00.a dynamicFeedJsonDeserializableAdapter = (a00.a) oaVar.f113719h9.get();
                Intrinsics.checkNotNullParameter(dynamicFeedJsonDeserializableAdapter, "dynamicFeedJsonDeserializableAdapter");
                rz.e eVar8 = new rz.e();
                TypeToken typeToken2 = new TypeToken(vd0.c.class);
                Intrinsics.checkNotNullExpressionValue(typeToken2, "get(...)");
                eVar8.a(typeToken2, fVar);
                TypeToken typeToken3 = new TypeToken(DynamicFeed.class);
                Intrinsics.checkNotNullExpressionValue(typeToken3, "get(...)");
                eVar8.a(typeToken3, dynamicFeedJsonDeserializableAdapter);
                return eVar8;
            case AdSize.FULL_BANNER_WIDTH /* 468 */:
                return new a00.a((qh) oaVar.f114013y3.get());
            case 469:
                OkHttpClient client = (OkHttpClient) oaVar.f113956v0.get();
                String input = oaVar.Y2();
                Intrinsics.checkNotNullParameter(input, "baseUrl");
                Regex regex = new Regex("v3");
                Intrinsics.checkNotNullParameter(input, "input");
                Intrinsics.checkNotNullParameter("vx", "replacement");
                String vxBaseUrl = regex.f80468a.matcher(input).replaceFirst("vx");
                Intrinsics.checkNotNullExpressionValue(vxBaseUrl, "replaceFirst(...)");
                dl2.b.I(vxBaseUrl);
                Intrinsics.checkNotNullParameter(client, "client");
                Intrinsics.checkNotNullParameter(vxBaseUrl, "vxBaseUrl");
                pq2.c1 c1Var6 = new pq2.c1();
                c1Var6.c(vxBaseUrl);
                Objects.requireNonNull(client, "client == null");
                c1Var6.f101001a = client;
                Intrinsics.checkNotNullExpressionValue(c1Var6, "client(...)");
                p00.b bVar5 = (p00.b) oaVar.f113754j9.get();
                rz.c adapterFactory4 = (rz.c) oaVar.f114011y1.get();
                rq2.a n15 = n60.o.n(oaVar, c1Var6, "retrofit", bVar5, "converterFactory");
                Intrinsics.checkNotNullParameter(adapterFactory4, "adapterFactory");
                n60.o.u(n15, "gsonConverterFactory", c1Var6, adapterFactory4, bVar5);
                com.pinterest.feature.home.model.k kVar4 = (com.pinterest.feature.home.model.k) n60.o.h(c1Var6, n15, com.pinterest.feature.home.model.k.class, "create(...)");
                dl2.b.I(kVar4);
                return kVar4;
            case 470:
                return new m60.h0(hf0.b.q());
            case 471:
                m60.w eventManager = (m60.w) oaVar.f113885r0.get();
                fw.b adsGmaHeaderAnalytics = (fw.b) oaVar.f113824n9.get();
                mw.a adsGmaHeaderUtils = (mw.a) oaVar.f113842o9.get();
                iw.a queryInfoCache = (iw.a) oaVar.f113859p9.get();
                Intrinsics.checkNotNullParameter(eventManager, "eventManager");
                Intrinsics.checkNotNullParameter(adsGmaHeaderAnalytics, "adsGmaHeaderAnalytics");
                Intrinsics.checkNotNullParameter(adsGmaHeaderUtils, "adsGmaHeaderUtils");
                Intrinsics.checkNotNullParameter(queryInfoCache, "queryInfoCache");
                return new ew.c(eventManager, adsGmaHeaderAnalytics, adsGmaHeaderUtils, queryInfoCache);
            case 472:
                nx.d0 pinalytics2 = (nx.d0) oaVar.f113817n2.get();
                Intrinsics.checkNotNullParameter(pinalytics2, "pinalytics");
                return new fw.b(pinalytics2);
            case 473:
                return new mw.a();
            case 474:
                pb0.a clock2 = (pb0.a) oaVar.f113834o1.get();
                Intrinsics.checkNotNullParameter(clock2, "clock");
                return new iw.a(clock2);
            case 475:
                lh0.d adFormatsLibraryExperiments = (lh0.d) oaVar.Q6.get();
                xu1.y networkTypeMonitor2 = (xu1.y) oaVar.I0.get();
                Intrinsics.checkNotNullParameter(adFormatsLibraryExperiments, "adFormatsLibraryExperiments");
                Intrinsics.checkNotNullParameter(networkTypeMonitor2, "networkTypeMonitor");
                return new ds.d(adFormatsLibraryExperiments, networkTypeMonitor2);
            case 476:
                xu1.g networkStateMonitor = (xu1.g) oaVar.f113929t9.get();
                Intrinsics.checkNotNullParameter(networkStateMonitor, "networkStateMonitor");
                return networkStateMonitor.a();
            case 477:
                Context context4 = (Context) oaVar.f113902s0.get();
                m60.b0 appBackgroundDetector = com.pinterest.widget.configuration.k.t();
                Intrinsics.checkNotNullParameter(appBackgroundDetector, "appBackgroundDetector");
                jk2.v appBackgroundStateObservable = appBackgroundDetector.a();
                ao2.j0 applicationScope = (ao2.j0) oaVar.G0.get();
                Intrinsics.checkNotNullParameter(context4, "context");
                Intrinsics.checkNotNullParameter(appBackgroundStateObservable, "appBackgroundStateObservable");
                Intrinsics.checkNotNullParameter(applicationScope, "applicationScope");
                return new xu1.d(context4, appBackgroundStateObservable, applicationScope);
            case 478:
                return new lh0.g2((lh0.z0) oaVar.D0.get());
            case 479:
                return new lh0.c2((lh0.z0) oaVar.D0.get());
            case 480:
                return new lh0.k3((lh0.z0) oaVar.D0.get());
            case 481:
                return new gv1.f((lh0.z0) oaVar.D0.get(), (vy.m) oaVar.M1.get(), (b60.b) oaVar.f113850p0.get());
            case 482:
                return new n60.j(com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) oaVar.G0.get(), (tb0.h) oaVar.f113797m0.get());
            case 483:
                return new n60.m(com.pinterest.widget.configuration.k.h(oaVar.f113603b), oaVar.d3(), (tb0.h) oaVar.f113797m0.get());
            case 484:
                b60.b bVar6 = (b60.b) oaVar.f113850p0.get();
                vy.m mVar = (vy.m) oaVar.M1.get();
                at1.a aVar4 = (at1.a) oaVar.B9.get();
                at1.d dVar = (at1.d) oaVar.f113902s0.get();
                m60.b0 appBackgroundDetector2 = com.pinterest.widget.configuration.k.t();
                Intrinsics.checkNotNullParameter(appBackgroundDetector2, "appBackgroundDetector");
                return new n60.v(bVar6, mVar, aVar4, dVar, appBackgroundDetector2.a(), (y70.g) oaVar.E9.get(), (tb0.h) oaVar.f113797m0.get(), (nx.d0) oaVar.f113817n2.get(), oaVar.d3());
            case 485:
                at1.d application = (at1.d) oaVar.f113902s0.get();
                Intrinsics.checkNotNullParameter(application, "application");
                dl2.b.I(application);
                return application;
            case 486:
                Application h10 = com.pinterest.widget.configuration.k.h(oaVar.f113603b);
                z70.f fVar2 = (z70.f) oaVar.f113764k2.get();
                m60.f0 f0Var = vb0.j.f125466a;
                dl2.b.I(f0Var);
                return new y70.g(h10, fVar2, f0Var, (y70.e) oaVar.D9.get(), (tb0.h) oaVar.f113797m0.get(), oa.F0(oaVar));
            case 487:
                return new y70.e((at1.d) oaVar.f113902s0.get(), (bz.i) oaVar.C9.get(), (m60.w) oaVar.f113885r0.get(), (nx.o0) oaVar.T1.get(), (tb0.h) oaVar.f113797m0.get(), (pb0.a) oaVar.f113834o1.get());
            case 488:
                return new bz.i();
            case 489:
                return new tb0.n((ox.b) oaVar.M1.get());
            case 490:
                return new g62.d(oa.y0(oaVar), (Context) oaVar.f113902s0.get(), (tb0.h) oaVar.f113797m0.get());
            case 491:
                return new rg0.e((rg0.s) oaVar.Q5.get(), (m60.w) oaVar.f113885r0.get(), (nx.f0) oaVar.f113747j2.get(), oaVar.f113799m2, (uh0.c) oaVar.I9.get(), (vy.m) oaVar.M1.get());
            case 492:
                try {
                    Object newInstance = uh0.c.class.newInstance();
                    Intrinsics.g(newInstance, "null cannot be cast to non-null type com.pinterest.brandSurveyLibrary.di.modules.expressSurvey.ExpressSurveyHelper");
                    return (uh0.c) newInstance;
                } catch (Exception e13) {
                    throw new RuntimeException(e13);
                }
            case 493:
                pq2.c1 retrofit3 = (pq2.c1) oaVar.f113623c2.get();
                rz.c adapterFactory5 = (rz.c) oaVar.f114011y1.get();
                p00.b converterFactory = (p00.b) oaVar.M9.get();
                rq2.a J2 = oaVar.J2();
                Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                Intrinsics.checkNotNullParameter(adapterFactory5, "adapterFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                n60.o.u(J2, "gsonConverterFactory", retrofit3, adapterFactory5, converterFactory);
                e20.a aVar5 = (e20.a) n60.o.h(retrofit3, J2, e20.a.class, "create(...)");
                dl2.b.I(aVar5);
                return aVar5;
            case 494:
                rz.e registry = (rz.e) oaVar.K9.get();
                p00.d bodyConverter = new p00.d();
                q00.a stringConverter = (q00.a) oaVar.L9.get();
                Intrinsics.checkNotNullParameter(registry, "registry");
                Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
                Intrinsics.checkNotNullParameter(stringConverter, "stringConverter");
                return new p00.b(registry, bodyConverter, stringConverter);
            case 495:
                return new rz.e();
            case 496:
                nm.o gson = (nm.o) oaVar.f113833o0.get();
                Intrinsics.checkNotNullParameter(gson, "gson");
                return new q00.a(gson);
            case 497:
                return new z70.k((lu1.d) oaVar.f113782l2.get(), (nx.d0) oaVar.f113817n2.get());
            case 498:
                return new ib0.b();
            case 499:
                return new com.pinterest.encryption.dataEncryptionLibrary.a(com.pinterest.widget.configuration.k.h(oaVar.f113603b), new r42.b(bf2.b.a(oaVar.M1), (b60.b) oaVar.f113850p0.get()), new r42.d(bf2.b.a(oaVar.M1), (b60.b) oaVar.f113850p0.get()));
            default:
                throw new AssertionError(i13);
        }
    }

    public final Object f() {
        rz.f fVar = rz.f.f110230a;
        oa oaVar = this.f113568a;
        int i13 = this.f113569b;
        switch (i13) {
            case 500:
                pq2.c1 c1Var = (pq2.c1) oaVar.f113623c2.get();
                p00.d bodyConverter = new p00.d();
                rz.e adapterRegistry = (rz.e) oaVar.T9.get();
                Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
                Intrinsics.checkNotNullParameter(adapterRegistry, "adapterRegistry");
                p00.b bVar = new p00.b(adapterRegistry, bodyConverter, null);
                rz.c adapterFactory = (rz.c) oaVar.f114011y1.get();
                rq2.a n13 = n60.o.n(oaVar, c1Var, "retrofit", bVar, "converterFactory");
                Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
                n60.o.u(n13, "gsonConverterFactory", c1Var, adapterFactory, bVar);
                c12.a aVar = (c12.a) n60.o.h(c1Var, n13, c12.a.class, "create(...)");
                dl2.b.I(aVar);
                return new cz.e(aVar, (m60.w) oaVar.f113885r0.get(), (i92.k) oaVar.f113921t1.get(), (cz.h) oaVar.U9.get());
            case 501:
                c12.b surveyJsonDeserializableAdapter = (c12.b) oaVar.R9.get();
                c12.c visitJsonDeserializableAdapter = (c12.c) oaVar.S9.get();
                Intrinsics.checkNotNullParameter(surveyJsonDeserializableAdapter, "surveyJsonDeserializableAdapter");
                Intrinsics.checkNotNullParameter(visitJsonDeserializableAdapter, "visitJsonDeserializableAdapter");
                rz.e eVar = new rz.e();
                TypeToken typeToken = new TypeToken(fr0.class);
                Intrinsics.checkNotNullExpressionValue(typeToken, "get(...)");
                eVar.a(typeToken, surveyJsonDeserializableAdapter);
                TypeToken typeToken2 = new TypeToken(w01.class);
                Intrinsics.checkNotNullExpressionValue(typeToken2, "get(...)");
                eVar.a(typeToken2, visitJsonDeserializableAdapter);
                TypeToken typeToken3 = new TypeToken(vd0.c.class);
                Intrinsics.checkNotNullExpressionValue(typeToken3, "get(...)");
                eVar.a(typeToken3, fVar);
                return eVar;
            case 502:
                return new c12.b();
            case 503:
                return new c12.c();
            case 504:
                return new cz.h();
            case 505:
                return new qa2.d(oa.x1(oaVar));
            case 506:
                return new i91.n((i92.k) oaVar.f113921t1.get(), (m60.w) oaVar.f113885r0.get(), (b60.b) oaVar.f113850p0.get(), (oc.c) oaVar.f113907s5.get(), (nx.f0) oaVar.f113747j2.get(), (m60.e) oaVar.f113920t0.get(), (lb0.q) oaVar.O0.get());
            case 507:
                return new s50.a((lb0.q) oaVar.O0.get());
            case 508:
                return new bv1.a(oa.R0(oaVar), (fv1.b) oaVar.Z9.get());
            case 509:
                return new fv1.b((m60.w) oaVar.f113885r0.get());
            case 510:
                return new ro1.c((nx.d1) oaVar.f113730i2.get(), (c82.d) oaVar.f113648da.get(), (nx.b0) oaVar.R8.get(), (es.a) oaVar.P6.get(), (vr.a) oaVar.Q8.get());
            case 511:
                return new c82.d((c82.e) oaVar.f113631ca.get(), (gz1.b) oaVar.C1.get());
            case BitmapUtils.BITMAP_TO_JPEG_SIZE /* 512 */:
                pq2.c1 c1Var2 = (pq2.c1) oaVar.f113623c2.get();
                rz.e eVar2 = (rz.e) oaVar.f113614ba.get();
                p00.b bVar2 = new p00.b(eVar2, n60.o.k(eVar2, "registry", "bodyConverter"), null);
                rz.c adapterFactory2 = (rz.c) oaVar.f114011y1.get();
                rq2.a n14 = n60.o.n(oaVar, c1Var2, "retrofit", bVar2, "converterFactory");
                Intrinsics.checkNotNullParameter(adapterFactory2, "adapterFactory");
                n60.o.u(n14, "gsonConverterFactory", c1Var2, adapterFactory2, bVar2);
                c82.e eVar3 = (c82.e) n60.o.h(c1Var2, n14, c82.e.class, "create(...)");
                dl2.b.I(eVar3);
                return eVar3;
            case 513:
                rz.e eVar4 = new rz.e();
                eVar4.a(n60.o.f(String.class, "get(...)"), new i00.a());
                return eVar4;
            case 514:
                uk1.a defaultPresenterPinalyticsFactory = (uk1.a) oaVar.f113684fa.get();
                Intrinsics.checkNotNullParameter(defaultPresenterPinalyticsFactory, "defaultPresenterPinalyticsFactory");
                dl2.b.I(defaultPresenterPinalyticsFactory);
                return defaultPresenterPinalyticsFactory;
            case 515:
                return new uk1.a((nx.f0) oaVar.f113747j2.get());
            case 516:
                oaVar.f113585a.getClass();
                try {
                    Object newInstance = PostSaveUpsellModalViewProviderImpl.class.newInstance();
                    Intrinsics.g(newInstance, "null cannot be cast to non-null type com.pinterest.activity.library.modal.PostSaveUpsellModalViewProvider");
                    return (PostSaveUpsellModalViewProviderImpl) newInstance;
                } catch (Exception e13) {
                    throw new RuntimeException(e13);
                }
            case 517:
                return new x02.p2((dl1.p) oaVar.f113755ja.get(), (dl1.a0) oaVar.f113860pa.get(), (dl1.z) oaVar.f113878qa.get(), (gl1.d) oaVar.f113895ra.get(), bf2.b.a(oaVar.F3));
            case 518:
                dl1.t0 stub = (dl1.t0) oaVar.f113738ia.get();
                Intrinsics.checkNotNullParameter(stub, "stub");
                dl2.b.I(stub);
                return stub;
            case 519:
                return new dl1.t0();
            case 520:
                se2.a retrofit = bf2.b.a(oaVar.f113843oa);
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Object obj = ((bf2.b) retrofit).get();
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                dl1.a0 a0Var = (dl1.a0) obj;
                dl2.b.I(a0Var);
                return a0Var;
            case 521:
                return new i12.b((l22.a) oaVar.f113825na.get());
            case 522:
                pq2.c1 c1Var3 = (pq2.c1) oaVar.f113623c2.get();
                p00.b A3 = a02.e.A3((rz.e) oaVar.f113807ma.get(), new p00.d());
                rz.c adapterFactory3 = (rz.c) oaVar.f114011y1.get();
                rq2.a n15 = n60.o.n(oaVar, c1Var3, "retrofit", A3, "converterFactory");
                Intrinsics.checkNotNullParameter(adapterFactory3, "adapterFactory");
                n60.o.u(n15, "gsonConverterFactory", c1Var3, adapterFactory3, A3);
                l22.a aVar2 = (l22.a) n60.o.h(c1Var3, n15, l22.a.class, "create(...)");
                dl2.b.I(aVar2);
                return aVar2;
            case 523:
                l22.c userDidItDataFeedJsonDeserializableAdapter = (l22.c) oaVar.f113772ka.get();
                l22.d userDidItDataJsonDeserializableAdapter = (l22.d) oaVar.f113790la.get();
                Intrinsics.checkNotNullParameter(userDidItDataFeedJsonDeserializableAdapter, "userDidItDataFeedJsonDeserializableAdapter");
                Intrinsics.checkNotNullParameter(userDidItDataJsonDeserializableAdapter, "userDidItDataJsonDeserializableAdapter");
                rz.e eVar5 = new rz.e();
                TypeToken typeToken4 = new TypeToken(UserDidItDataFeed.class);
                Intrinsics.checkNotNullExpressionValue(typeToken4, "get(...)");
                eVar5.a(typeToken4, userDidItDataFeedJsonDeserializableAdapter);
                TypeToken typeToken5 = new TypeToken(az0.class);
                Intrinsics.checkNotNullExpressionValue(typeToken5, "get(...)");
                eVar5.a(typeToken5, userDidItDataJsonDeserializableAdapter);
                TypeToken typeToken6 = new TypeToken(vd0.c.class);
                Intrinsics.checkNotNullExpressionValue(typeToken6, "get(...)");
                eVar5.a(typeToken6, fVar);
                return eVar5;
            case 524:
                return new l22.c((ke0.b) oaVar.B4.get());
            case 525:
                return new l22.d((ke0.a) oaVar.B4.get());
            case 526:
                fl1.a policy = (fl1.a) oaVar.T2.get();
                Intrinsics.checkNotNullParameter(policy, "policy");
                dl2.b.I(policy);
                return policy;
            case 527:
                return new gl1.c(null, 7);
            case 528:
                return new t.a();
            case 529:
                return new y9(this);
            case 530:
                et1.h0 simpleProducerFactory = (et1.h0) oaVar.f113948ua.get();
                Intrinsics.checkNotNullParameter(simpleProducerFactory, "simpleProducerFactory");
                return new et1.r(simpleProducerFactory);
            case 531:
                return new et1.h0();
            case 532:
                return new t.a();
            case 533:
                return new t.a();
            case 534:
                tb0.h crashReporting = (tb0.h) oaVar.f113797m0.get();
                et1.h0 simpleProducerFactory2 = (et1.h0) oaVar.f113948ua.get();
                et1.f0 runningMedianCalculatorFactory = (et1.f0) oaVar.f114020ya.get();
                Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
                Intrinsics.checkNotNullParameter(simpleProducerFactory2, "simpleProducerFactory");
                Intrinsics.checkNotNullParameter(runningMedianCalculatorFactory, "runningMedianCalculatorFactory");
                return new et1.m(crashReporting, simpleProducerFactory2, runningMedianCalculatorFactory);
            case 535:
                return new et1.f0();
            case 536:
                return new et1.d0();
            case 537:
                tb0.h crashReporting2 = (tb0.h) oaVar.f113797m0.get();
                et1.h0 simpleProducerFactory3 = (et1.h0) oaVar.f113948ua.get();
                et1.b mediaCodecInputBufferCopier = (et1.b) oaVar.Ba.get();
                Intrinsics.checkNotNullParameter(crashReporting2, "crashReporting");
                Intrinsics.checkNotNullParameter(simpleProducerFactory3, "simpleProducerFactory");
                Intrinsics.checkNotNullParameter(mediaCodecInputBufferCopier, "mediaCodecInputBufferCopier");
                return new et1.y(crashReporting2, simpleProducerFactory3, mediaCodecInputBufferCopier);
            case 538:
                jt1.c cVar = new jt1.c();
                cVar.f77586a = new jt1.b();
                return cVar;
            case 539:
                return new t.a();
            case 540:
                return new ht1.j0((et1.r) oaVar.Fa.get(), (et1.s) oaVar.Ma.get(), (t.a) oaVar.Na.get());
            case 541:
                et1.h0 simpleProducerFactory4 = (et1.h0) oaVar.f113948ua.get();
                Intrinsics.checkNotNullParameter(simpleProducerFactory4, "simpleProducerFactory");
                return new et1.r(simpleProducerFactory4);
            case 542:
                et1.r trimAudioToStartTimeFactory = (et1.r) oaVar.Ga.get();
                et1.r trimAudioToEndTimeFactory = (et1.r) oaVar.Ha.get();
                t.a startTimeSetterFactory = (t.a) oaVar.Ia.get();
                et1.d0 passThroughNodeFactory = (et1.d0) oaVar.Aa.get();
                t.a mediaPacketToAudioPacketFactory = (t.a) oaVar.Ja.get();
                et1.x audioDecoderFactory = (et1.x) oaVar.La.get();
                Intrinsics.checkNotNullParameter(trimAudioToStartTimeFactory, "trimAudioToStartTimeFactory");
                Intrinsics.checkNotNullParameter(trimAudioToEndTimeFactory, "trimAudioToEndTimeFactory");
                Intrinsics.checkNotNullParameter(startTimeSetterFactory, "startTimeSetterFactory");
                Intrinsics.checkNotNullParameter(passThroughNodeFactory, "passThroughNodeFactory");
                Intrinsics.checkNotNullParameter(mediaPacketToAudioPacketFactory, "mediaPacketToAudioPacketFactory");
                Intrinsics.checkNotNullParameter(audioDecoderFactory, "audioDecoderFactory");
                return new et1.s(trimAudioToStartTimeFactory, trimAudioToEndTimeFactory, startTimeSetterFactory, passThroughNodeFactory, mediaPacketToAudioPacketFactory, audioDecoderFactory);
            case 543:
                et1.h0 simpleProducerFactory5 = (et1.h0) oaVar.f113948ua.get();
                Intrinsics.checkNotNullParameter(simpleProducerFactory5, "simpleProducerFactory");
                return new et1.r(simpleProducerFactory5);
            case 544:
                et1.h0 simpleProducerFactory6 = (et1.h0) oaVar.f113948ua.get();
                Intrinsics.checkNotNullParameter(simpleProducerFactory6, "simpleProducerFactory");
                return new et1.r(simpleProducerFactory6);
            case 545:
                return new t.a();
            case 546:
                return new t.a();
            case 547:
                tb0.h crashReporting3 = (tb0.h) oaVar.f113797m0.get();
                et1.h0 simpleProducerFactory7 = (et1.h0) oaVar.f113948ua.get();
                t.a mediaFormatToImmutableFactory = (t.a) oaVar.Ka.get();
                et1.b mediaCodecInputBufferCopier2 = (et1.b) oaVar.Ba.get();
                Intrinsics.checkNotNullParameter(crashReporting3, "crashReporting");
                Intrinsics.checkNotNullParameter(simpleProducerFactory7, "simpleProducerFactory");
                Intrinsics.checkNotNullParameter(mediaFormatToImmutableFactory, "mediaFormatToImmutableFactory");
                Intrinsics.checkNotNullParameter(mediaCodecInputBufferCopier2, "mediaCodecInputBufferCopier");
                return new et1.x(crashReporting3, simpleProducerFactory7, mediaFormatToImmutableFactory, mediaCodecInputBufferCopier2);
            case 548:
                return new t.a();
            case 549:
                return new t.a();
            case 550:
                t.a increasingTimeSpanGeneratorFactory = (t.a) oaVar.Pa.get();
                et1.g silentAudioGeneratorProvider = (et1.g) oaVar.Qa.get();
                t.a startTimeSetterFactory2 = (t.a) oaVar.Ia.get();
                et1.r trimAudioToEndTimeFactory2 = (et1.r) oaVar.Ha.get();
                et1.g0 sendFirstReceivedOnlyFactory = (et1.g0) oaVar.Ra.get();
                et1.d0 passThroughNodeFactory2 = (et1.d0) oaVar.Aa.get();
                Intrinsics.checkNotNullParameter(increasingTimeSpanGeneratorFactory, "increasingTimeSpanGeneratorFactory");
                Intrinsics.checkNotNullParameter(silentAudioGeneratorProvider, "silentAudioGeneratorProvider");
                Intrinsics.checkNotNullParameter(startTimeSetterFactory2, "startTimeSetterFactory");
                Intrinsics.checkNotNullParameter(trimAudioToEndTimeFactory2, "trimAudioToEndTimeFactory");
                Intrinsics.checkNotNullParameter(sendFirstReceivedOnlyFactory, "sendFirstReceivedOnlyFactory");
                Intrinsics.checkNotNullParameter(passThroughNodeFactory2, "passThroughNodeFactory");
                return new ht1.r0();
            case 551:
                return new t.a();
            case 552:
                return new et1.u();
            case 553:
                return new et1.g0();
            case 554:
                et1.g audioMixerNodeProvider = (et1.g) oaVar.Ta.get();
                ht1.o0 pcmAudioAlignerFactory = (ht1.o0) oaVar.Ya.get();
                et1.g dynamicAudioConverterProvider = (et1.g) oaVar.f113649db.get();
                et1.d0 passThroughNodeFactory3 = (et1.d0) oaVar.Aa.get();
                z9 replaceGapsWithSilenceFactory = (z9) oaVar.f113685fb.get();
                Intrinsics.checkNotNullParameter(audioMixerNodeProvider, "audioMixerNodeProvider");
                Intrinsics.checkNotNullParameter(pcmAudioAlignerFactory, "pcmAudioAlignerFactory");
                Intrinsics.checkNotNullParameter(dynamicAudioConverterProvider, "dynamicAudioConverterProvider");
                Intrinsics.checkNotNullParameter(passThroughNodeFactory3, "passThroughNodeFactory");
                Intrinsics.checkNotNullParameter(replaceGapsWithSilenceFactory, "replaceGapsWithSilenceFactory");
                return new et1.n(audioMixerNodeProvider, pcmAudioAlignerFactory, dynamicAudioConverterProvider, passThroughNodeFactory3, replaceGapsWithSilenceFactory);
            case 555:
                et1.h0 simpleProducerFactory8 = (et1.h0) oaVar.f113948ua.get();
                Intrinsics.checkNotNullParameter(simpleProducerFactory8, "simpleProducerFactory");
                return new et1.p(simpleProducerFactory8, 1);
            case 556:
                return new ht1.o0((et1.g) oaVar.Va.get(), (et1.g) oaVar.Wa.get(), (t.a) oaVar.Xa.get());
            case 557:
                et1.e0 ringByteBufferFactory = (et1.e0) oaVar.Ua.get();
                Intrinsics.checkNotNullParameter(ringByteBufferFactory, "ringByteBufferFactory");
                return new et1.p(ringByteBufferFactory, 3);
            case 558:
                return new et1.e0();
            case 559:
                et1.h0 simpleProducerFactory9 = (et1.h0) oaVar.f113948ua.get();
                Intrinsics.checkNotNullParameter(simpleProducerFactory9, "simpleProducerFactory");
                return new et1.p(simpleProducerFactory9, 0);
            case 560:
                return new t.a();
            case 561:
                final et1.d0 passThroughNodeFactory4 = (et1.d0) oaVar.Aa.get();
                final et1.b0 linearPipelineBuilderFactory = (et1.b0) oaVar.Za.get();
                final gt1.e audioTypeConverterFactory = (gt1.e) oaVar.f113597ab.get();
                final gt1.f channelConverterFactory = (gt1.f) oaVar.f113615bb.get();
                final gt1.d audioResamplerFactory = (gt1.d) oaVar.f113632cb.get();
                Intrinsics.checkNotNullParameter(passThroughNodeFactory4, "passThroughNodeFactory");
                Intrinsics.checkNotNullParameter(linearPipelineBuilderFactory, "linearPipelineBuilderFactory");
                Intrinsics.checkNotNullParameter(audioTypeConverterFactory, "audioTypeConverterFactory");
                Intrinsics.checkNotNullParameter(channelConverterFactory, "channelConverterFactory");
                Intrinsics.checkNotNullParameter(audioResamplerFactory, "audioResamplerFactory");
                return new et1.g() { // from class: et1.w
                    @Override // et1.g
                    public final Object a(wk2.a componentProvider) {
                        d0 passThroughNodeFactory5 = d0.this;
                        Intrinsics.checkNotNullParameter(passThroughNodeFactory5, "$passThroughNodeFactory");
                        b0 linearPipelineBuilderFactory2 = linearPipelineBuilderFactory;
                        Intrinsics.checkNotNullParameter(linearPipelineBuilderFactory2, "$linearPipelineBuilderFactory");
                        gt1.e audioTypeConverterFactory2 = audioTypeConverterFactory;
                        Intrinsics.checkNotNullParameter(audioTypeConverterFactory2, "$audioTypeConverterFactory");
                        gt1.f channelConverterFactory2 = channelConverterFactory;
                        Intrinsics.checkNotNullParameter(channelConverterFactory2, "$channelConverterFactory");
                        gt1.d audioResamplerFactory2 = audioResamplerFactory;
                        Intrinsics.checkNotNullParameter(audioResamplerFactory2, "$audioResamplerFactory");
                        Intrinsics.checkNotNullParameter(componentProvider, "componentProvider");
                        return new ht1.b0(passThroughNodeFactory5, linearPipelineBuilderFactory2, audioTypeConverterFactory2, channelConverterFactory2, audioResamplerFactory2, componentProvider);
                    }
                };
            case 562:
                et1.d0 passThroughNodeFactory5 = (et1.d0) oaVar.Aa.get();
                Intrinsics.checkNotNullParameter(passThroughNodeFactory5, "passThroughNodeFactory");
                return new et1.b0(passThroughNodeFactory5);
            case 563:
                return new gt1.e((et1.d0) oaVar.Aa.get(), (et1.h0) oaVar.f113948ua.get());
            case 564:
                return new gt1.f((et1.d0) oaVar.Aa.get(), (et1.h0) oaVar.f113948ua.get());
            case 565:
                return new gt1.d((et1.d0) oaVar.Aa.get());
            case 566:
                return new z9(this);
            case 567:
                return new aa(this);
            case 568:
                et1.h0 simpleProducerFactory10 = (et1.h0) oaVar.f113948ua.get();
                Intrinsics.checkNotNullParameter(simpleProducerFactory10, "simpleProducerFactory");
                return new et1.r(simpleProducerFactory10);
            case 569:
                return new t.a();
            case 570:
                final et1.d0 passThroughNodeFactory6 = (et1.d0) oaVar.Aa.get();
                final et1.a0 doNotSendDoneProducingCallbackFactory = (et1.a0) oaVar.jb.get();
                Intrinsics.checkNotNullParameter(passThroughNodeFactory6, "passThroughNodeFactory");
                Intrinsics.checkNotNullParameter(doNotSendDoneProducingCallbackFactory, "doNotSendDoneProducingCallbackFactory");
                return new et1.g() { // from class: et1.t
                    @Override // et1.g
                    public final Object a(wk2.a componentProvider) {
                        d0 passThroughNodeFactory7 = d0.this;
                        Intrinsics.checkNotNullParameter(passThroughNodeFactory7, "$passThroughNodeFactory");
                        a0 doNotSendDoneProducingCallbackFactory2 = doNotSendDoneProducingCallbackFactory;
                        Intrinsics.checkNotNullParameter(doNotSendDoneProducingCallbackFactory2, "$doNotSendDoneProducingCallbackFactory");
                        Intrinsics.checkNotNullParameter(componentProvider, "componentProvider");
                        return new gt1.c(doNotSendDoneProducingCallbackFactory2, passThroughNodeFactory7, componentProvider);
                    }
                };
            case 571:
                return new et1.a0();
            case 572:
                et1.f0 runningMedianCalculatorFactory2 = (et1.f0) oaVar.f114020ya.get();
                Intrinsics.checkNotNullParameter(runningMedianCalculatorFactory2, "runningMedianCalculatorFactory");
                return new et1.c0(runningMedianCalculatorFactory2);
            case 573:
                et1.z concatenatingProducerFactory = (et1.z) oaVar.f113808mb.get();
                et1.p composerPipelineAdapterProvider = a02.e.d2((et1.h0) oaVar.f113948ua.get());
                et1.r demuxerFactory = (et1.r) oaVar.Fa.get();
                et1.m muxRenderNodeFactory = (et1.m) oaVar.f114038za.get();
                gi2.b timeRangeTrimmerFactory = new gi2.b();
                t.a mediaPacketStartTimeSetterFactory = (t.a) oaVar.f113826nb.get();
                Intrinsics.checkNotNullParameter(concatenatingProducerFactory, "concatenatingProducerFactory");
                Intrinsics.checkNotNullParameter(composerPipelineAdapterProvider, "composerPipelineAdapterProvider");
                Intrinsics.checkNotNullParameter(demuxerFactory, "demuxerFactory");
                Intrinsics.checkNotNullParameter(muxRenderNodeFactory, "muxRenderNodeFactory");
                Intrinsics.checkNotNullParameter(timeRangeTrimmerFactory, "timeRangeTrimmerFactory");
                Intrinsics.checkNotNullParameter(mediaPacketStartTimeSetterFactory, "mediaPacketStartTimeSetterFactory");
                return new jg1.a0(concatenatingProducerFactory, composerPipelineAdapterProvider, demuxerFactory, muxRenderNodeFactory, timeRangeTrimmerFactory, mediaPacketStartTimeSetterFactory);
            case 574:
                return new et1.z();
            case 575:
                return new t.a();
            case 576:
                et1.q zeroDeltaVideoEncoderFactory = (et1.q) oaVar.Ab.get();
                t.a codecInitDataParserFactory = (t.a) oaVar.Bb.get();
                tb0.h crashReporting4 = (tb0.h) oaVar.f113797m0.get();
                Intrinsics.checkNotNullParameter(zeroDeltaVideoEncoderFactory, "zeroDeltaVideoEncoderFactory");
                Intrinsics.checkNotNullParameter(codecInitDataParserFactory, "codecInitDataParserFactory");
                Intrinsics.checkNotNullParameter(crashReporting4, "crashReporting");
                return new lg1.c(new eq1.a(zeroDeltaVideoEncoderFactory, codecInitDataParserFactory, crashReporting4));
            case 577:
                t.a bitWriterFactory = (t.a) oaVar.f113861pb.get();
                t.a multiBitWriterFactory = (t.a) oaVar.f113879qb.get();
                et1.v bitReaderFactory = (et1.v) oaVar.f113896rb.get();
                et1.l multiBitReaderFactory = (et1.l) oaVar.f113913sb.get();
                t.a golombCodeReaderFactory = (t.a) oaVar.f113931tb.get();
                t.a avcEmulationByteUnescaperFactory = (t.a) oaVar.f113949ub.get();
                t.a avcEmulationByteEscaperFactory = (t.a) oaVar.f113967vb.get();
                t.a golombCodeWriterFactory = (t.a) oaVar.f113985wb.get();
                na spsParserProvider = oaVar.f114021yb;
                na ppsParserProvider = oaVar.f114039zb;
                Intrinsics.checkNotNullParameter(bitWriterFactory, "bitWriterFactory");
                Intrinsics.checkNotNullParameter(multiBitWriterFactory, "multiBitWriterFactory");
                Intrinsics.checkNotNullParameter(bitReaderFactory, "bitReaderFactory");
                Intrinsics.checkNotNullParameter(multiBitReaderFactory, "multiBitReaderFactory");
                Intrinsics.checkNotNullParameter(golombCodeReaderFactory, "golombCodeReaderFactory");
                Intrinsics.checkNotNullParameter(avcEmulationByteUnescaperFactory, "avcEmulationByteUnescaperFactory");
                Intrinsics.checkNotNullParameter(avcEmulationByteEscaperFactory, "avcEmulationByteEscaperFactory");
                Intrinsics.checkNotNullParameter(golombCodeWriterFactory, "golombCodeWriterFactory");
                Intrinsics.checkNotNullParameter(spsParserProvider, "spsParserProvider");
                Intrinsics.checkNotNullParameter(ppsParserProvider, "ppsParserProvider");
                return new et1.q(multiBitReaderFactory, bitReaderFactory, bitWriterFactory, avcEmulationByteEscaperFactory, golombCodeReaderFactory, avcEmulationByteUnescaperFactory, multiBitWriterFactory, golombCodeWriterFactory, spsParserProvider, ppsParserProvider);
            case 578:
                return new t.a();
            case 579:
                return new t.a();
            case 580:
                return new et1.v();
            case 581:
                return new et1.l();
            case 582:
                return new t.a();
            case 583:
                return new t.a();
            case 584:
                return new t.a();
            case 585:
                return new t.a();
            case 586:
                et1.v bitReaderFactory2 = (et1.v) oaVar.f113896rb.get();
                et1.l multiBitReaderFactory2 = (et1.l) oaVar.f113913sb.get();
                t.a golombCodeReaderFactory2 = (t.a) oaVar.f113931tb.get();
                na vuiParametersParserProvider = oaVar.f114003xb;
                Intrinsics.checkNotNullParameter(bitReaderFactory2, "bitReaderFactory");
                Intrinsics.checkNotNullParameter(multiBitReaderFactory2, "multiBitReaderFactory");
                Intrinsics.checkNotNullParameter(golombCodeReaderFactory2, "golombCodeReaderFactory");
                Intrinsics.checkNotNullParameter(vuiParametersParserProvider, "vuiParametersParserProvider");
                Object obj2 = vuiParametersParserProvider.get();
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                return new ot1.a1(bitReaderFactory2, multiBitReaderFactory2, golombCodeReaderFactory2, (ot1.e1) obj2);
            case 587:
                org.chromium.net.y hrdParametersParser = new org.chromium.net.y();
                tb0.h crashReporting5 = (tb0.h) oaVar.f113797m0.get();
                Intrinsics.checkNotNullParameter(hrdParametersParser, "hrdParametersParser");
                Intrinsics.checkNotNullParameter(crashReporting5, "crashReporting");
                return new ot1.e1(hrdParametersParser, crashReporting5);
            case 588:
                et1.v bitReaderFactory3 = (et1.v) oaVar.f113896rb.get();
                et1.l multiBitReaderFactory3 = (et1.l) oaVar.f113913sb.get();
                t.a golombCodeReaderFactory3 = (t.a) oaVar.f113931tb.get();
                Intrinsics.checkNotNullParameter(bitReaderFactory3, "bitReaderFactory");
                Intrinsics.checkNotNullParameter(multiBitReaderFactory3, "multiBitReaderFactory");
                Intrinsics.checkNotNullParameter(golombCodeReaderFactory3, "golombCodeReaderFactory");
                return new ot1.l0(bitReaderFactory3, multiBitReaderFactory3, golombCodeReaderFactory3);
            case 589:
                return new t.a();
            case 590:
                return new ba(this);
            case 591:
                lh0.z0 experimentsActivator = (lh0.z0) oaVar.D0.get();
                kz1.a powerscoreCalculator = (kz1.a) oaVar.D6.get();
                Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
                Intrinsics.checkNotNullParameter(powerscoreCalculator, "powerscoreCalculator");
                return new kv.a("android_audio_overlay_powerscore", experimentsActivator, powerscoreCalculator);
            case 592:
                m60.f0 f0Var = oaVar.f113620c;
                lb0.q prefsManagerPersisted = (lb0.q) oaVar.O0.get();
                m60.e applicationInfo = (m60.e) oaVar.f113920t0.get();
                f0Var.getClass();
                Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
                Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
                return new yr.a(prefsManagerPersisted, applicationInfo);
            case 593:
                ao2.j0 applicationScope = (ao2.j0) oaVar.G0.get();
                Intrinsics.checkNotNullParameter(applicationScope, "applicationScope");
                return new hs.c(applicationScope);
            case 594:
                return new ca(this);
            case 595:
                return new da(this);
            case 596:
                return new ub(oa.x1(oaVar), (kv.a) oaVar.Db.get());
            case 597:
                return new ek1.x1((m60.w) oaVar.f113885r0.get(), oa.x1(oaVar));
            case 598:
                return new ri1.a((m60.w) oaVar.f113885r0.get(), oaVar.b2());
            case 599:
                nx.d0 pinalytics = (nx.d0) oaVar.f113817n2.get();
                pb0.a clock = (pb0.a) oaVar.f113834o1.get();
                nx.d1 trackingParamAttacher = (nx.d1) oaVar.f113730i2.get();
                qs.a adsBtrImpressionLogger = (qs.a) oaVar.Lb.get();
                ao2.j0 applicationScope2 = (ao2.j0) oaVar.G0.get();
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                Intrinsics.checkNotNullParameter(clock, "clock");
                Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
                Intrinsics.checkNotNullParameter(adsBtrImpressionLogger, "adsBtrImpressionLogger");
                Intrinsics.checkNotNullParameter(applicationScope2, "applicationScope");
                nx.z0 z0Var = new nx.z0();
                z0Var.put("video_play_type", "autoadvance_image");
                z0Var.put("is_closeup_video", "false");
                Unit unit = Unit.f80348a;
                cc2.c cVar2 = new cc2.c(pinalytics, z0Var, trackingParamAttacher);
                vb0.e eVar6 = lh0.j.f83391b;
                if (lh0.j.f83392c == null) {
                    eVar6.f().invoke();
                    eVar6.g(lh0.c.f83307k);
                }
                lh0.j jVar = lh0.j.f83392c;
                if (jVar != null) {
                    return new fv.c(pinalytics, cVar2, clock, adsBtrImpressionLogger, jVar, applicationScope2);
                }
                Intrinsics.r("INSTANCE");
                throw null;
            default:
                throw new AssertionError(i13);
        }
    }

    public final Object g() {
        int extensionVersion;
        rz.f fVar = rz.f.f110230a;
        m60.f0 f0Var = vb0.j.f125466a;
        oa oaVar = this.f113568a;
        int i13 = this.f113569b;
        switch (i13) {
            case AdSize.WIDE_SKYSCRAPER_HEIGHT /* 600 */:
                return com.pinterest.widget.configuration.k.e((ur.a) oaVar.Kb.get());
            case 601:
                return new ur.b((es.a) oaVar.P6.get(), (vr.a) oaVar.Q8.get(), (es.h) oaVar.f113735i7.get());
            case 602:
                return new zy.q0((bz.i) oaVar.C9.get(), new rd.j(oaVar.T2()), (nx.d1) oaVar.f113730i2.get(), (nx.o0) oaVar.T1.get(), (ao2.j0) oaVar.G0.get());
            case 603:
                dl2.b.I(f0Var);
                return new ni1.e(f0Var, (pi1.b) oaVar.Pb.get());
            case 604:
                return new pi1.b((e10.j) oaVar.Ob.get());
            case 605:
                vy.m mVar = (vy.m) oaVar.M1.get();
                dl2.b.I(f0Var);
                return u00.m.a(mVar, f0Var);
            case 606:
                return new hk1.a((PinService) oaVar.f113713h3.get(), (x02.i2) oaVar.F3.get(), (i92.k) oaVar.f113921t1.get());
            case 607:
                return new ek1.j((a11.d) oaVar.f113668ec.get(), (nx.f0) oaVar.f113747j2.get(), (fa) oaVar.f113704gc.get(), (es.h) oaVar.f113735i7.get(), (es.a) oaVar.P6.get());
            case 608:
                return new a11.d((m60.w) oaVar.f113885r0.get(), (nx.d1) oaVar.f113730i2.get(), (j80.b) oaVar.O6.get(), (c82.d) oaVar.f113648da.get(), (lu1.b) oaVar.f113961v5.get(), (ea) oaVar.Sb.get(), (a11.y) oaVar.f113633cc.get(), (lh0.n1) oaVar.E0.get(), (x02.x2) oaVar.f113800m3.get(), (x02.x0) oaVar.f113765k3.get(), (bs.b) oaVar.f113650dc.get(), (es.a) oaVar.P6.get(), (nx.b0) oaVar.R8.get(), (es.h) oaVar.f113735i7.get());
            case 609:
                return new ea(this);
            case 610:
                return new a11.y((x02.n2) oaVar.f113616bc.get());
            case 611:
                dl1.p localDataSource = (dl1.p) oaVar.Ub.get();
                dl1.a0 remoteDataSource = (dl1.a0) oaVar.Xb.get();
                dl1.z persistencePolicy = (dl1.z) oaVar.Zb.get();
                gl1.d repositorySchedulerPolicy = (gl1.d) oaVar.f113598ac.get();
                Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
                Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
                Intrinsics.checkNotNullParameter(persistencePolicy, "persistencePolicy");
                Intrinsics.checkNotNullParameter(repositorySchedulerPolicy, "repositorySchedulerPolicy");
                return new x02.n2(localDataSource, remoteDataSource, persistencePolicy, repositorySchedulerPolicy, null, null, null, null, null, null, null, null, null, null, 32752);
            case 612:
                dl1.t0 stub = (dl1.t0) oaVar.Tb.get();
                Intrinsics.checkNotNullParameter(stub, "stub");
                dl2.b.I(stub);
                return stub;
            case 613:
                return new dl1.t0();
            case 614:
                e22.a retrofit = (e22.a) oaVar.Wb.get();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                dl2.b.I(retrofit);
                return retrofit;
            case 615:
                return new e22.a((a30.a) oaVar.Vb.get());
            case 616:
                pq2.c1 retrofit3 = (pq2.c1) oaVar.f113623c2.get();
                rz.c adapterFactory = (rz.c) oaVar.f114011y1.get();
                rq2.a gsonConverterFactory = oaVar.J2();
                p00.d bodyConverter = new p00.d();
                rz.e registry = (rz.e) oaVar.f113714h4.get();
                Context context = (Context) oaVar.f113902s0.get();
                Intrinsics.checkNotNullParameter(context, "context");
                String string = context.getString(m60.x0.pin_state_alert_reported);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                dl2.b.I(string);
                e00.b deserializerAdapter = new e00.b(string);
                Intrinsics.checkNotNullParameter(registry, "registry");
                Intrinsics.checkNotNullParameter(deserializerAdapter, "deserializerAdapter");
                TypeToken typeToken = new TypeToken(my0.class);
                Intrinsics.checkNotNullExpressionValue(typeToken, "get(...)");
                registry.a(typeToken, deserializerAdapter);
                TypeToken typeToken2 = new TypeToken(vd0.c.class);
                Intrinsics.checkNotNullExpressionValue(typeToken2, "get(...)");
                registry.a(typeToken2, fVar);
                Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
                Intrinsics.checkNotNullParameter(registry, "registry");
                p00.b converterFactory = new p00.b(registry, bodyConverter, null);
                Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
                Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                retrofit3.a(adapterFactory);
                retrofit3.b(converterFactory);
                a30.a aVar = (a30.a) n60.o.h(retrofit3, gsonConverterFactory, a30.a.class, "create(...)");
                dl2.b.I(aVar);
                return aVar;
            case 617:
                fl1.b alwaysNever = (fl1.b) oaVar.Yb.get();
                Intrinsics.checkNotNullParameter(alwaysNever, "alwaysNever");
                dl2.b.I(alwaysNever);
                return alwaysNever;
            case 618:
                return new fl1.b();
            case 619:
                return new gl1.c(null, 7);
            case 620:
                return new bs.b((zr.b) oaVar.W8.get(), (lh0.d) oaVar.Q6.get(), (nx.d0) oaVar.f113817n2.get());
            case 621:
                return new fa(this);
            case 622:
                return new aa2.a((m60.w) oaVar.f113885r0.get());
            case 623:
                Application application = com.pinterest.widget.configuration.k.h(oaVar.f113603b);
                Intrinsics.checkNotNullParameter(application, "application");
                return new hk1.f((m60.m0) application);
            case 624:
                nx.d0 pinalytics = (nx.d0) oaVar.f113817n2.get();
                Context context2 = (Context) oaVar.f113902s0.get();
                pb0.a clock = (pb0.a) oaVar.f113834o1.get();
                tb0.h crashReporting = (tb0.h) oaVar.f113797m0.get();
                ao2.j0 applicationScope = (ao2.j0) oaVar.G0.get();
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter(clock, "clock");
                Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
                Intrinsics.checkNotNullParameter(applicationScope, "applicationScope");
                if (Build.VERSION.SDK_INT >= 30) {
                    extensionVersion = SdkExtensions.getExtensionVersion(1000000);
                    if (extensionVersion >= 4) {
                        MeasurementManager a13 = com.appsflyer.internal.a.a(context2.getSystemService(com.appsflyer.internal.a.b()));
                        Intrinsics.f(a13);
                        return new xr.d(a13, clock, crashReporting, applicationScope, pinalytics);
                    }
                }
                return xr.e.f135670a;
            case 625:
                return new k92.j(oa.R1(oaVar));
            case 626:
                return new bk1.f2((ro1.d) oaVar.f113666ea.get(), (bs.g) oaVar.f113650dc.get(), (Context) oaVar.f113902s0.get());
            case 627:
                Context context3 = (Context) oaVar.f113902s0.get();
                ao2.j0 applicationScope2 = (ao2.j0) oaVar.G0.get();
                es.a adFormats = (es.a) oaVar.P6.get();
                xw.a adsOpenMeasurementPowerScoreExpt = (xw.a) oaVar.f113809mc.get();
                tw.a api = (tw.a) oaVar.f113845oc.get();
                pb0.a clock2 = (pb0.a) oaVar.f113834o1.get();
                lb0.g diskCache = (lb0.g) oaVar.f113938u0.get();
                Intrinsics.checkNotNullParameter(api, "api");
                Intrinsics.checkNotNullParameter(clock2, "clock");
                Intrinsics.checkNotNullParameter(diskCache, "diskCache");
                ko2.f fVar2 = ao2.v0.f20219a;
                ko2.e eVar = ko2.e.f80326c;
                lb0.o a14 = lb0.n.f82725d.a();
                Intrinsics.checkNotNullExpressionValue(a14, "user(...)");
                yw.f adsOpenMeasurementJsRepository = new yw.f(api, eVar, clock2, diskCache, a14);
                gs.a adQuarantine = (gs.a) oaVar.f113862pc.get();
                m60.e applicationInfoProvider = (m60.e) oaVar.f113920t0.get();
                ws1.a linkValidation = (ws1.a) oaVar.R6.get();
                nx.d0 pinalytics2 = (nx.d0) oaVar.f113817n2.get();
                Intrinsics.checkNotNullParameter(pinalytics2, "pinalytics");
                sw.b adsOpenMeasurementPinalytics = new sw.b(pinalytics2);
                wr.d adFormatsLogger = oaVar.X1();
                vr.a adsCommonAnalytics = (vr.a) oaVar.Q8.get();
                lh0.k adsOpenMeasurementExperiments = new lh0.k((lh0.z0) oaVar.D0.get());
                Intrinsics.checkNotNullParameter(adFormatsLogger, "adFormatsLogger");
                Intrinsics.checkNotNullParameter(adsCommonAnalytics, "adsCommonAnalytics");
                Intrinsics.checkNotNullParameter(adsOpenMeasurementExperiments, "adsOpenMeasurementExperiments");
                qw.b adsOpenMeasurementJsonLogger = new qw.b(adFormatsLogger, adsCommonAnalytics, adsOpenMeasurementExperiments);
                pb0.a clock3 = (pb0.a) oaVar.f113834o1.get();
                Intrinsics.checkNotNullParameter(context3, "context");
                Intrinsics.checkNotNullParameter(applicationScope2, "applicationScope");
                Intrinsics.checkNotNullParameter(adFormats, "adFormats");
                Intrinsics.checkNotNullParameter(adsOpenMeasurementPowerScoreExpt, "adsOpenMeasurementPowerScoreExpt");
                Intrinsics.checkNotNullParameter(adsOpenMeasurementJsRepository, "adsOpenMeasurementJsRepository");
                Intrinsics.checkNotNullParameter(adQuarantine, "adQuarantine");
                Intrinsics.checkNotNullParameter(applicationInfoProvider, "applicationInfoProvider");
                Intrinsics.checkNotNullParameter(linkValidation, "linkValidation");
                Intrinsics.checkNotNullParameter(adsOpenMeasurementPinalytics, "adsOpenMeasurementPinalytics");
                Intrinsics.checkNotNullParameter(adsOpenMeasurementJsonLogger, "adsOpenMeasurementJsonLogger");
                Intrinsics.checkNotNullParameter(clock3, "clock");
                return new ow.p0(adsOpenMeasurementPowerScoreExpt, new uw.b(context3), new pw.c(adsOpenMeasurementPinalytics, adsOpenMeasurementJsonLogger), adsOpenMeasurementJsRepository, adFormats, adQuarantine, applicationScope2, applicationInfoProvider, linkValidation, clock3);
            case 628:
                iz1.a powerScoreManager = (iz1.a) oaVar.X8.get();
                Intrinsics.checkNotNullParameter(powerScoreManager, "powerScoreManager");
                return new xw.b(powerScoreManager);
            case 629:
                pq2.d1 retrofit4 = (pq2.d1) oaVar.f113827nc.get();
                Intrinsics.checkNotNullParameter(retrofit4, "retrofit");
                Object b13 = retrofit4.b(tw.a.class);
                Intrinsics.checkNotNullExpressionValue(b13, "create(...)");
                tw.a aVar2 = (tw.a) b13;
                dl2.b.I(aVar2);
                return aVar2;
            case 630:
                OkHttpClient okHttpClient = (OkHttpClient) oaVar.A1.get();
                pq2.c1 retrofit5 = oaVar.f3();
                Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
                Intrinsics.checkNotNullParameter(retrofit5, "retrofit");
                OkHttpClient.Builder newBuilder = okHttpClient.newBuilder();
                newBuilder.f95676c.clear();
                retrofit5.c("https://s.pinimg.com/om/");
                retrofit5.f101001a = new OkHttpClient(newBuilder);
                pq2.d1 d2 = retrofit5.d();
                Intrinsics.checkNotNullExpressionValue(d2, "build(...)");
                return d2;
            case 631:
                return new gs.a();
            case 632:
                return new nv.b(oa.g0(oaVar), oaVar.X1(), (es.h) oaVar.f113735i7.get(), (es.a) oaVar.P6.get(), (lh0.o) oaVar.f113769k7.get());
            case 633:
                vb0.i iVar = oaVar.f113710h0;
                lh0.j adsLibraryExperiments = oa.g0(oaVar);
                j80.b carouselUtil = (j80.b) oaVar.O6.get();
                es.a adFormats2 = (es.a) oaVar.P6.get();
                iVar.getClass();
                Intrinsics.checkNotNullParameter(adsLibraryExperiments, "adsLibraryExperiments");
                Intrinsics.checkNotNullParameter(carouselUtil, "carouselUtil");
                Intrinsics.checkNotNullParameter(adFormats2, "adFormats");
                return new jv.a(adsLibraryExperiments, carouselUtil, adFormats2);
            case 634:
                return new r70.f((s70.b) oaVar.f113968vc.get(), (s70.e) oaVar.f113986wc.get(), (s70.a) oaVar.f114004xc.get(), (s70.d) oaVar.f114022yc.get(), (s70.c) oaVar.f114040zc.get(), new m60.f0(), (b60.b) oaVar.f113850p0.get(), new lh0.w((lh0.z0) oaVar.D0.get()));
            case 635:
                return new s70.b();
            case 636:
                return new s70.e();
            case 637:
                return new s70.a();
            case 638:
                return new s70.d();
            case 639:
                return new s70.c();
            case 640:
                return new ou1.g(a02.e.g2(new zp.f((m60.w) oaVar.f113885r0.get(), oaVar.Bc, (i92.k) oaVar.f113921t1.get(), oaVar.f114036z8, (lu1.d) oaVar.f113782l2.get(), oaVar.Z7, (tb0.h) oaVar.f113797m0.get(), new lh0.t1((lh0.z0) oaVar.D0.get()))));
            case 641:
                return new bw0.b((bw0.c) oaVar.f113612b8.get());
            case 642:
                oaVar.f113585a.getClass();
                try {
                    Object newInstance = BoardCreateOrPickerNavigationProviderImpl.class.newInstance();
                    Intrinsics.g(newInstance, "null cannot be cast to non-null type com.pinterest.education.event.BoardCreateOrPickerNavigationProvider");
                    return (BoardCreateOrPickerNavigationProviderImpl) newInstance;
                } catch (Exception e13) {
                    throw new RuntimeException(e13);
                }
            case 643:
                b60.b activeUserManager = (b60.b) oaVar.f113850p0.get();
                Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
                return ((b60.d) activeUserManager).f();
            case 644:
                return new AggregatedCommentDeserializer();
            case 645:
                return new BoardNoteListDeserializer();
            case 646:
                return new BoardNotePinCollectionDeserializer();
            case 647:
                return new FeedSectionTitleDeserializer();
            case 648:
                return new LensHistoryObjectDeserializer();
            case 649:
                return new ConversationContactRequestDeserializer((BoardDeserializer) oaVar.P2.get(), oa.C0(oaVar));
            case 650:
                return new UserReactionDeserializer((ModelDeserializerWithSaveAndMerge) oaVar.f113905s3.get());
            case 651:
                return new NewsHubItemDeserializer((ModelDeserializerWithSaveAndMerge) oaVar.W2.get(), (ModelDeserializerWithSaveAndMerge) oaVar.P2.get(), (ModelDeserializerWithSaveAndMerge) oaVar.f113749j4.get(), (ModelDeserializerWithSaveAndMerge) oaVar.f113589a3.get(), (ke0.a) oaVar.B4.get());
            case 652:
                return new SearchFeedTabsDeserializer();
            case 653:
                return new CreatorRecommendationItemDeserializer((x02.v1) oaVar.f113960v4.get(), (x02.x2) oaVar.f113800m3.get());
            case 654:
                return new TrackedCommentDeserializer();
            case 655:
                return new StoryDeserializer();
            case 656:
                return new ScheduledPinDeserializer();
            case 657:
                return new PearTopicDeserializer();
            case 658:
                return new ShuffleAssetDeserializer();
            case 659:
                return new CommentStickerDeserializer();
            case 660:
                return new kf1.b((de0.d) oaVar.S7.get(), (tb0.h) oaVar.f113797m0.get(), (Context) oaVar.f113902s0.get(), (nx.d0) oaVar.f113817n2.get(), (fe0.b) oaVar.f113893r8.get());
            case 661:
                try {
                    Object newInstance2 = SearchTypeAheadProvidersImpl.class.newInstance();
                    Intrinsics.g(newInstance2, "null cannot be cast to non-null type com.pinterest.feature.community.utils.SearchTypeAheadProviders");
                    return (up0.b) newInstance2;
                } catch (Exception e14) {
                    throw new RuntimeException(e14);
                }
            case 662:
                return new up0.l((lu1.b) oaVar.f113961v5.get(), (i92.k) oaVar.f113921t1.get(), (yk1.j) oaVar.Qc.get(), oaVar.f113817n2, (uj2.q) oaVar.f113947u9.get());
            case 663:
                yk1.j a15 = yk1.j.a();
                Intrinsics.checkNotNullExpressionValue(a15, "getInstance(...)");
                dl2.b.I(a15);
                return a15;
            case 664:
                return new ac2.u1((ac2.h1) oaVar.B7.get());
            case 665:
                wy.a aVar3 = new wy.a((nx.d0) oaVar.f113817n2.get(), (vy.m) oaVar.M1.get());
                return aVar3;
            case 666:
                na naVar = oaVar.Uc;
                tb0.h hVar = (tb0.h) oaVar.f113797m0.get();
                ey.j3 j3Var = ey.j3.f60510a;
                return new tx.d(naVar, hVar, (vy.m) oaVar.M1.get(), (b60.b) oaVar.f113850p0.get(), (m60.e) oaVar.f113920t0.get(), (f30.b) oaVar.V1.get(), (lh0.n1) oaVar.E0.get());
            case 667:
                return new tx.b((b60.b) oaVar.f113850p0.get(), (m60.e) oaVar.f113920t0.get(), (tb0.h) oaVar.f113797m0.get(), (lb0.r) oaVar.f113622c1.get());
            case 668:
                return new a80.a();
            case 669:
                return new bz.d();
            case 670:
                return new z70.o();
            case 671:
                return new gf0.a();
            case 672:
                pd.s sVar = new pd.s();
                sVar.f99747a = oaVar;
                return new tc2.a(sVar);
            case 673:
                oaVar.getClass();
                return new yq0.v(new lh0.y2((lh0.z0) oaVar.D0.get()), (ox.b) oaVar.M1.get());
            case 674:
                rz.e eVar2 = new rz.e();
                TypeToken typeToken3 = new TypeToken(vd0.c.class);
                Intrinsics.checkNotNullExpressionValue(typeToken3, "get(...)");
                eVar2.a(typeToken3, fVar);
                return eVar2;
            case 675:
                nm.o gson = (nm.o) oaVar.f113833o0.get();
                Intrinsics.checkNotNullParameter(gson, "gson");
                return new p00.c(gson);
            case 676:
                pq2.c1 retrofit6 = (pq2.c1) oaVar.f113623c2.get();
                rz.c adapterFactory2 = (rz.c) oaVar.f114011y1.get();
                rq2.a gsonConverterFactory2 = oaVar.J2();
                rz.e registry2 = (rz.e) oaVar.f113669ed.get();
                p00.d bodyConverter2 = new p00.d();
                r00.a fieldConverter = (r00.a) oaVar.f113687fd.get();
                Intrinsics.checkNotNullParameter(registry2, "registry");
                Intrinsics.checkNotNullParameter(bodyConverter2, "bodyConverter");
                Intrinsics.checkNotNullParameter(fieldConverter, "fieldConverter");
                p00.b converterFactory2 = new p00.b(registry2, bodyConverter2, fieldConverter);
                Intrinsics.checkNotNullParameter(retrofit6, "retrofit");
                Intrinsics.checkNotNullParameter(adapterFactory2, "adapterFactory");
                Intrinsics.checkNotNullParameter(gsonConverterFactory2, "gsonConverterFactory");
                Intrinsics.checkNotNullParameter(converterFactory2, "converterFactory");
                retrofit6.a(adapterFactory2);
                retrofit6.b(converterFactory2);
                x10.b bVar = (x10.b) n60.o.h(retrofit6, gsonConverterFactory2, x10.b.class, "create(...)");
                dl2.b.I(bVar);
                return bVar;
            case 677:
                PinDeserializer pinDeserializer = (PinDeserializer) oaVar.W2.get();
                b22.b pinFeedDeserializableAdapter = (b22.b) oaVar.Y2.get();
                Intrinsics.checkNotNullParameter(pinDeserializer, "pinDeserializer");
                Intrinsics.checkNotNullParameter(pinFeedDeserializableAdapter, "pinFeedDeserializableAdapter");
                rz.e eVar3 = new rz.e();
                eVar3.a(n60.o.f(f30.class, "get(...)"), new e00.a(pinDeserializer));
                TypeToken typeToken4 = new TypeToken(PinFeed.class);
                Intrinsics.checkNotNullExpressionValue(typeToken4, "get(...)");
                eVar3.a(typeToken4, pinFeedDeserializableAdapter);
                TypeToken typeToken5 = new TypeToken(vd0.c.class);
                Intrinsics.checkNotNullExpressionValue(typeToken5, "get(...)");
                eVar3.a(typeToken5, fVar);
                return eVar3;
            case 678:
                return new r00.a();
            case 679:
                xk2.v vVar = zf0.f.f141903e;
                zf0.f e15 = vb0.e.e();
                dl2.b.I(e15);
                return e15;
            case 680:
                return new e02.a((rg0.s) oaVar.Q5.get(), (zf0.f) oaVar.f113723hd.get(), (m60.w) oaVar.f113885r0.get(), (k11.k) oaVar.f113741id.get());
            case 681:
                k11.k kVar = new k11.k();
                kVar.f78148a = new k11.j();
                return kVar;
            case 682:
                return new iv1.b((lb0.o) oaVar.f113780l0.get(), new lh0.i2((lh0.z0) oaVar.D0.get()), (tb0.h) oaVar.f113797m0.get(), (m60.w) oaVar.f113885r0.get(), (Context) oaVar.f113902s0.get(), (b60.b) oaVar.f113850p0.get());
            case 683:
                return new zs.a();
            case 684:
                return new jo1.c();
            case 685:
                return new c91.d(oaVar.f113902s0, (ao2.j0) oaVar.G0.get());
            case 686:
                return new c72.b0(oa.z1(oaVar));
            case 687:
                return new n72.b((c72.c0) oaVar.f113863pd.get());
            case 688:
                return new c72.c0();
            case 689:
                return new an0.h((b60.b) oaVar.f113850p0.get());
            case 690:
                rz.e eVar4 = (rz.e) oaVar.f113915sd.get();
                return new p00.b(eVar4, n60.o.k(eVar4, "registry", "bodyConverter"), null);
            case 691:
                x02.q1 dynamicFeedJsonDeserializableAdapter = (x02.q1) oaVar.f114031z3.get();
                Intrinsics.checkNotNullParameter(dynamicFeedJsonDeserializableAdapter, "dynamicFeedJsonDeserializableAdapter");
                rz.e eVar5 = new rz.e();
                eVar5.a(n60.o.f(com.pinterest.api.model.ua.class, "get(...)"), vz.e.f126897a);
                TypeToken typeToken6 = new TypeToken(com.pinterest.api.model.ta.class);
                Intrinsics.checkNotNullExpressionValue(typeToken6, "get(...)");
                eVar5.a(typeToken6, vz.d.f126896a);
                TypeToken typeToken7 = new TypeToken(DynamicFeed.class);
                Intrinsics.checkNotNullExpressionValue(typeToken7, "get(...)");
                eVar5.a(typeToken7, dynamicFeedJsonDeserializableAdapter);
                return eVar5;
            case 692:
                return new t00.l((b60.b) oaVar.f113850p0.get(), (m60.w) oaVar.f113885r0.get(), (qb0.e) oaVar.f113869q1.get(), (t00.c) oaVar.f113886r1.get(), (t00.k) oaVar.f113903s1.get(), (m60.e) oaVar.f113920t0.get(), (t00.i) oaVar.f113939u1.get());
            case 693:
                ConversationContactRequestDeserializer conversationContactRequestDeserializer = (ConversationContactRequestDeserializer) oaVar.Hc.get();
                Intrinsics.checkNotNullParameter(conversationContactRequestDeserializer, "conversationContactRequestDeserializer");
                rz.e eVar6 = new rz.e();
                eVar6.a(n60.o.f(ve.class, "get(...)"), new p12.a(conversationContactRequestDeserializer, 1));
                TypeToken typeToken8 = new TypeToken(ContactRequestFeed.class);
                Intrinsics.checkNotNullExpressionValue(typeToken8, "get(...)");
                eVar6.a(typeToken8, new p12.a(conversationContactRequestDeserializer, 0));
                return eVar6;
            case 694:
                HashMap hashMap = rw0.f.f110112b;
                rw0.f fVar3 = rw0.e.f110110a;
                Intrinsics.checkNotNullExpressionValue(fVar3, "getInstance(...)");
                dl2.b.I(fVar3);
                return fVar3;
            case 695:
                dl1.p pVar = (dl1.p) oaVar.f114023yd.get();
                uq0.b bVar2 = (uq0.b) oaVar.Ad.get();
                dl1.z zVar = (dl1.z) oaVar.Cd.get();
                m60.g0 g0Var = (m60.g0) oaVar.f113590a4.get();
                a02.e.M4(g0Var);
                x02.u2 u2Var = new x02.u2(pVar, bVar2, zVar, g0Var);
                m60.f0.u0(u2Var);
                return u2Var;
            case 696:
                dl1.t0 stub2 = (dl1.t0) oaVar.f114005xd.get();
                Intrinsics.checkNotNullParameter(stub2, "stub");
                dl2.b.I(stub2);
                return stub2;
            case 697:
                return new dl1.t0();
            case 698:
                se2.a retrofitSourceRemote = bf2.b.a(oaVar.f114041zd);
                Intrinsics.checkNotNullParameter(retrofitSourceRemote, "retrofitSourceRemote");
                Object obj = ((bf2.b) retrofitSourceRemote).get();
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                uq0.b bVar3 = (uq0.b) obj;
                dl2.b.I(bVar3);
                return bVar3;
            case 699:
                return new b12.a((k22.m) oaVar.Y4.get(), (uj2.a0) oaVar.Y3.get(), (uj2.a0) oaVar.Z3.get());
            default:
                throw new AssertionError(i13);
        }
    }

    @Override // wk2.a
    public final Object get() {
        Object jVar;
        fw.d dVar;
        jw.b bVar;
        tb0.h hVar;
        boolean z13;
        int i13 = this.f113569b;
        switch (i13 / 100) {
            case 0:
                return a();
            case 1:
                return b();
            case 2:
                return c();
            case 3:
                return d();
            case 4:
                return e();
            case 5:
                return f();
            case 6:
                return g();
            case 7:
                return h();
            case 8:
                oa oaVar = this.f113568a;
                switch (i13) {
                    case 800:
                        uj2.a0 a0Var = tk2.e.f118017c;
                        Intrinsics.checkNotNullExpressionValue(a0Var, "io(...)");
                        return new gl1.c(a0Var, 6);
                    case 801:
                        return new nx.z((xu1.y) oaVar.I0.get(), (ao2.j0) oaVar.G0.get(), (nx.f0) oaVar.f113747j2.get());
                    case 802:
                        return new gs0.i();
                    case 803:
                        return new bs0.d();
                    case 804:
                        return new x52.n((Context) oaVar.f113902s0.get(), (ao2.j0) oaVar.G0.get(), (m60.w) oaVar.f113885r0.get(), oa.w1(oaVar));
                    case 805:
                        vy.m analyticsApi = (vy.m) oaVar.M1.get();
                        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
                        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
                        m60.r rVar = new m60.r();
                        rVar.f85938a = analyticsApi;
                        return rVar;
                    case 806:
                        Context context = (Context) oaVar.f113902s0.get();
                        lb0.r prefsManagerUser = (lb0.r) oaVar.f113622c1.get();
                        pb0.a clock = (pb0.a) oaVar.f113834o1.get();
                        gw.f adsGmaSdkDecorator = (gw.f) oaVar.Ff.get();
                        lh0.i adsGmaLibraryExperiments = oa.f0(oaVar);
                        ix.d adsGmaConfigManager = (ix.d) oaVar.If.get();
                        kw.a adsGmaQuarantine = (kw.a) oaVar.Jf.get();
                        ao2.j0 applicationScope = (ao2.j0) oaVar.G0.get();
                        fw.c adsGmaLibraryAnalytics = (fw.c) oaVar.Ef.get();
                        ew.l adsGmaHeaderManager = (ew.l) oaVar.f113877q9.get();
                        lw.d adsGmaQueryInfoManager = (lw.d) oaVar.Kf.get();
                        hw.c adsGmaCrashBackoffManager = (hw.c) oaVar.f113595a9.get();
                        mw.a adsGmaHeaderUtils = (mw.a) oaVar.f113842o9.get();
                        m60.w eventManager = (m60.w) oaVar.f113885r0.get();
                        tb0.h crashReporting = (tb0.h) oaVar.f113797m0.get();
                        jw.b powerscoreExperimentManager = (jw.b) oaVar.Y8.get();
                        fw.d adsGmaLogger = (fw.d) oaVar.Z8.get();
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
                        Intrinsics.checkNotNullParameter(clock, "clock");
                        Intrinsics.checkNotNullParameter(adsGmaSdkDecorator, "adsGmaSdkDecorator");
                        Intrinsics.checkNotNullParameter(adsGmaLibraryExperiments, "adsGmaLibraryExperiments");
                        Intrinsics.checkNotNullParameter(adsGmaConfigManager, "adsGmaConfigManager");
                        Intrinsics.checkNotNullParameter(adsGmaQuarantine, "adsGmaQuarantine");
                        Intrinsics.checkNotNullParameter(applicationScope, "applicationScope");
                        Intrinsics.checkNotNullParameter(adsGmaLibraryAnalytics, "adsGmaLibraryAnalytics");
                        Intrinsics.checkNotNullParameter(adsGmaHeaderManager, "adsGmaHeaderManager");
                        Intrinsics.checkNotNullParameter(adsGmaQueryInfoManager, "adsGmaQueryInfoManager");
                        Intrinsics.checkNotNullParameter(adsGmaCrashBackoffManager, "adsGmaCrashBackoffManager");
                        Intrinsics.checkNotNullParameter(adsGmaHeaderUtils, "adsGmaHeaderUtils");
                        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
                        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
                        Intrinsics.checkNotNullParameter(powerscoreExperimentManager, "powerscoreExperimentManager");
                        Intrinsics.checkNotNullParameter(adsGmaLogger, "adsGmaLogger");
                        if (!tb0.o.f117106m) {
                            dVar = adsGmaLogger;
                            bVar = powerscoreExperimentManager;
                            hVar = crashReporting;
                            if (!((lb0.b) lb0.n.f82724c.a()).e("PREF_DID_CRASH_BY_ANR", false)) {
                                z13 = false;
                                jVar = new ew.j(context, prefsManagerUser, clock, adsGmaSdkDecorator, adsGmaLibraryExperiments, adsGmaConfigManager, adsGmaQuarantine, applicationScope, adsGmaLibraryAnalytics, adsGmaHeaderManager, adsGmaHeaderUtils, adsGmaQueryInfoManager, adsGmaCrashBackoffManager, eventManager, hVar, bVar, z13, dVar);
                                break;
                            }
                        } else {
                            dVar = adsGmaLogger;
                            bVar = powerscoreExperimentManager;
                            hVar = crashReporting;
                        }
                        z13 = true;
                        jVar = new ew.j(context, prefsManagerUser, clock, adsGmaSdkDecorator, adsGmaLibraryExperiments, adsGmaConfigManager, adsGmaQuarantine, applicationScope, adsGmaLibraryAnalytics, adsGmaHeaderManager, adsGmaHeaderUtils, adsGmaQueryInfoManager, adsGmaCrashBackoffManager, eventManager, hVar, bVar, z13, dVar);
                    case 807:
                        pb0.a clock2 = (pb0.a) oaVar.f113834o1.get();
                        fw.c gmaAnalytics = (fw.c) oaVar.Ef.get();
                        hw.c adsGmaCrashBackoffManager2 = (hw.c) oaVar.f113595a9.get();
                        hf0.c deviceInfoProvider = (hf0.c) oaVar.f113717h7.get();
                        Intrinsics.checkNotNullParameter(clock2, "clock");
                        Intrinsics.checkNotNullParameter(gmaAnalytics, "gmaAnalytics");
                        Intrinsics.checkNotNullParameter(adsGmaCrashBackoffManager2, "adsGmaCrashBackoffManager");
                        Intrinsics.checkNotNullParameter(deviceInfoProvider, "deviceInfoProvider");
                        jVar = new gw.f(clock2, gmaAnalytics, adsGmaCrashBackoffManager2, deviceInfoProvider);
                        break;
                    case 808:
                        nx.d0 pinalytics = (nx.d0) oaVar.f113817n2.get();
                        zr.b adsSystemUtils = (zr.b) oaVar.W8.get();
                        lh0.i adsGmaLibraryExperiments2 = oa.f0(oaVar);
                        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                        Intrinsics.checkNotNullParameter(adsSystemUtils, "adsSystemUtils");
                        Intrinsics.checkNotNullParameter(adsGmaLibraryExperiments2, "adsGmaLibraryExperiments");
                        return new fw.c(pinalytics, adsSystemUtils);
                    case 809:
                        pb0.a clock3 = (pb0.a) oaVar.f113834o1.get();
                        kx.b adsConfigRepository = (kx.b) oaVar.Hf.get();
                        jx.a adsConfigAnalytics = (jx.a) oaVar.Gf.get();
                        ao2.j0 applicationScope2 = (ao2.j0) oaVar.G0.get();
                        Intrinsics.checkNotNullParameter(clock3, "clock");
                        Intrinsics.checkNotNullParameter(adsConfigRepository, "adsConfigRepository");
                        Intrinsics.checkNotNullParameter(adsConfigAnalytics, "adsConfigAnalytics");
                        Intrinsics.checkNotNullParameter(applicationScope2, "applicationScope");
                        return new ix.d(clock3, adsConfigRepository, adsConfigAnalytics, applicationScope2);
                    case 810:
                        m60.e applicationInfoProvider = (m60.e) oaVar.f113920t0.get();
                        pb0.a clock4 = (pb0.a) oaVar.f113834o1.get();
                        lb0.g diskCache = (lb0.g) oaVar.f113938u0.get();
                        jx.a adsConfigAnalytics2 = (jx.a) oaVar.Gf.get();
                        PinService pinService = (PinService) oaVar.f113713h3.get();
                        Intrinsics.checkNotNullParameter(applicationInfoProvider, "applicationInfoProvider");
                        Intrinsics.checkNotNullParameter(clock4, "clock");
                        Intrinsics.checkNotNullParameter(diskCache, "diskCache");
                        Intrinsics.checkNotNullParameter(adsConfigAnalytics2, "adsConfigAnalytics");
                        Intrinsics.checkNotNullParameter(pinService, "pinService");
                        lb0.o a13 = lb0.n.f82725d.a();
                        Intrinsics.checkNotNullExpressionValue(a13, "user(...)");
                        return new kx.b(applicationInfoProvider, clock4, diskCache, adsConfigAnalytics2, a13, pinService);
                    case 811:
                        nx.d0 pinalytics2 = (nx.d0) oaVar.f113817n2.get();
                        Intrinsics.checkNotNullParameter(pinalytics2, "pinalytics");
                        jVar = new jx.a(pinalytics2);
                        break;
                    case 812:
                        lh0.i adsGmaLibraryExperiments3 = oa.f0(oaVar);
                        ix.d adsGmaConfigManager2 = (ix.d) oaVar.If.get();
                        fw.c adsGmaLibraryAnalytics2 = (fw.c) oaVar.Ef.get();
                        ew.l adsGmaHeaderManager2 = (ew.l) oaVar.f113877q9.get();
                        Intrinsics.checkNotNullParameter(adsGmaLibraryExperiments3, "adsGmaLibraryExperiments");
                        Intrinsics.checkNotNullParameter(adsGmaConfigManager2, "adsGmaConfigManager");
                        Intrinsics.checkNotNullParameter(adsGmaLibraryAnalytics2, "adsGmaLibraryAnalytics");
                        Intrinsics.checkNotNullParameter(adsGmaHeaderManager2, "adsGmaHeaderManager");
                        return new kw.a(adsGmaLibraryExperiments3, adsGmaConfigManager2, adsGmaLibraryAnalytics2, adsGmaHeaderManager2);
                    case 813:
                        Context context2 = (Context) oaVar.f113902s0.get();
                        pb0.a clock5 = (pb0.a) oaVar.f113834o1.get();
                        ao2.j0 applicationScope3 = (ao2.j0) oaVar.G0.get();
                        ix.d adsGmaConfigManager3 = (ix.d) oaVar.If.get();
                        gw.f adsGmaSdkDecorator2 = (gw.f) oaVar.Ff.get();
                        ew.l adsGmaHeaderManager3 = (ew.l) oaVar.f113877q9.get();
                        iw.a queryInfoCache = (iw.a) oaVar.f113859p9.get();
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(clock5, "clock");
                        Intrinsics.checkNotNullParameter(applicationScope3, "applicationScope");
                        Intrinsics.checkNotNullParameter(adsGmaConfigManager3, "adsGmaConfigManager");
                        Intrinsics.checkNotNullParameter(adsGmaSdkDecorator2, "adsGmaSdkDecorator");
                        Intrinsics.checkNotNullParameter(adsGmaHeaderManager3, "adsGmaHeaderManager");
                        Intrinsics.checkNotNullParameter(queryInfoCache, "queryInfoCache");
                        jVar = new lw.c(context2, clock5, applicationScope3, adsGmaConfigManager3, adsGmaSdkDecorator2, adsGmaHeaderManager3, queryInfoCache);
                        break;
                    case 814:
                        return new com.pinterest.feature.pin.p();
                    case 815:
                        OkHttpClient client = (OkHttpClient) oaVar.f113974w0.get();
                        cy.k networkMetricsCollector = (cy.k) oaVar.S0.get();
                        tb.l telemetryPreferences = oaVar.d3();
                        Intrinsics.checkNotNullParameter(client, "client");
                        Intrinsics.checkNotNullParameter(networkMetricsCollector, "networkMetricsCollector");
                        Intrinsics.checkNotNullParameter(telemetryPreferences, "telemetryPreferences");
                        OkHttpClient.Builder newBuilder = client.newBuilder();
                        newBuilder.f95681h = false;
                        newBuilder.f95682i = false;
                        if (telemetryPreferences.w()) {
                            newBuilder.a(networkMetricsCollector.f53415f);
                        }
                        jVar = new OkHttpClient(newBuilder);
                        break;
                    case 816:
                        return new oc0.j();
                    case 817:
                        return new j72.d((k72.a) oaVar.Pf.get(), new c72.q(oaVar.h2(), new ll.j(new c72.p(oaVar.a3())), oaVar.g2(), oaVar.a3(), new org.chromium.net.y()), oa.j1(oaVar), new org.chromium.net.y(), new n72.a());
                    case 818:
                        pq2.d1 retrofit = oa.m0(oaVar);
                        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                        Object b13 = retrofit.b(k72.a.class);
                        Intrinsics.checkNotNullExpressionValue(b13, "create(...)");
                        k72.a aVar = (k72.a) b13;
                        dl2.b.I(aVar);
                        return aVar;
                    case 819:
                        return new x02.b1((dl1.p) oaVar.Sf.get(), (dl1.a0) oaVar.Uf.get(), (dl1.z) oaVar.Vf.get(), (gl1.d) oaVar.Wf.get());
                    case 820:
                        dl1.t0 localDataSource = (dl1.t0) oaVar.Rf.get();
                        Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
                        dl2.b.I(localDataSource);
                        return localDataSource;
                    case 821:
                        return new dl1.t0();
                    case 822:
                        i12.b remoteDataSource = new i12.b((o12.a) oaVar.Tf.get());
                        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
                        return remoteDataSource;
                    case 823:
                        pq2.d1 retrofit3 = (pq2.d1) oaVar.W3.get();
                        Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                        Object b14 = retrofit3.b(o12.a.class);
                        Intrinsics.checkNotNullExpressionValue(b14, "create(...)");
                        o12.a aVar2 = (o12.a) b14;
                        dl2.b.I(aVar2);
                        return aVar2;
                    case 824:
                        fl1.b persistencePolicy = (fl1.b) oaVar.Yb.get();
                        Intrinsics.checkNotNullParameter(persistencePolicy, "persistencePolicy");
                        dl2.b.I(persistencePolicy);
                        return persistencePolicy;
                    case 825:
                        return new gl1.c(null, 7);
                    case 826:
                        return new is1.i0((PinService) oaVar.f113713h3.get());
                    case 827:
                        return new lq0.r0(oaVar.v2(), (ni1.d0) oaVar.Gb.get(), (ni1.t2) oaVar.f113950uc.get());
                    case 828:
                        return new is1.a0((lb0.q) oaVar.O0.get(), new lh0.z((lh0.z0) oaVar.D0.get()), (is1.f) oaVar.f113758je.get());
                    case 829:
                        return new v72.a((ac2.o1) oaVar.C7.get());
                    case 830:
                        return new n72.g((o72.a) oaVar.f113672eg.get(), a02.e.j4());
                    case 831:
                        Context context3 = oaVar.f113603b.f67746a;
                        dl2.b.I(context3);
                        return new h72.l(context3, (k72.c) oaVar.f113637cg.get(), (k72.d) oaVar.f113654dg.get(), (c72.c0) oaVar.f113863pd.get(), new org.chromium.net.y(), new n72.a(), oaVar.a3(), new g4.u());
                    case 832:
                        pq2.d1 retrofit4 = (pq2.d1) oaVar.H1.get();
                        a02.e.K4(retrofit4);
                        Intrinsics.checkNotNullParameter(retrofit4, "retrofit");
                        Object b15 = retrofit4.b(k72.c.class);
                        Intrinsics.checkNotNullExpressionValue(b15, "create(...)");
                        k72.c cVar = (k72.c) b15;
                        dl2.b.I(cVar);
                        return cVar;
                    case 833:
                        pq2.d1 retrofit5 = oa.m0(oaVar);
                        Intrinsics.checkNotNullParameter(retrofit5, "retrofit");
                        Object b16 = retrofit5.b(k72.d.class);
                        Intrinsics.checkNotNullExpressionValue(b16, "create(...)");
                        k72.d dVar2 = (k72.d) b16;
                        dl2.b.I(dVar2);
                        return dVar2;
                    case 834:
                        return new e10.l((e10.j) oaVar.f113708gg.get());
                    case 835:
                        vy.m analyticsApi2 = (vy.m) oaVar.M1.get();
                        Intrinsics.checkNotNullParameter(analyticsApi2, "analyticsApi");
                        jVar = new e10.j(analyticsApi2, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
                        break;
                    case 836:
                        return new lt.i();
                    case 837:
                        x02.x0 boardRepository = (x02.x0) oaVar.f113765k3.get();
                        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
                        return boardRepository.i0();
                    case 838:
                        pq2.c1 retrofit6 = (pq2.c1) oaVar.f113623c2.get();
                        rz.c adapterFactory = (rz.c) oaVar.f114011y1.get();
                        rq2.a gsonConverterFactory = oaVar.J2();
                        p00.b converterFactory = a02.e.v3((rz.e) oaVar.f113778kg.get(), new p00.d());
                        Intrinsics.checkNotNullParameter(retrofit6, "retrofit");
                        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
                        Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
                        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                        retrofit6.a(adapterFactory);
                        retrofit6.b(converterFactory);
                        l80.a aVar3 = (l80.a) n60.o.h(retrofit6, gsonConverterFactory, l80.a.class, "create(...)");
                        dl2.b.I(aVar3);
                        return aVar3;
                    case 839:
                        rz.e eVar = new rz.e();
                        eVar.a(n60.o.f(com.pinterest.api.model.b1.class, "get(...)"), new sz.a(0));
                        return eVar;
                    case 840:
                        return new ws.x();
                    case 841:
                        return new h62.k(oaVar.a3());
                    case 842:
                        Context context4 = oaVar.f113603b.f67746a;
                        dl2.b.I(context4);
                        return new j72.s(context4, (k72.f) oaVar.f113848og.get(), new n72.a(), oaVar.a3(), oa.j1(oaVar));
                    case 843:
                        pq2.d1 retrofit7 = oa.m0(oaVar);
                        Intrinsics.checkNotNullParameter(retrofit7, "retrofit");
                        Object b17 = retrofit7.b(k72.f.class);
                        Intrinsics.checkNotNullExpressionValue(b17, "create(...)");
                        k72.f fVar = (k72.f) b17;
                        dl2.b.I(fVar);
                        return fVar;
                    case 844:
                        nm.p pVar = new nm.p();
                        pVar.b(new y80.b(), Date.class);
                        nm.o a14 = pVar.a();
                        Intrinsics.checkNotNullExpressionValue(a14, "create(...)");
                        return a14;
                    case 845:
                        Context context5 = oaVar.f113603b.f67746a;
                        dl2.b.I(context5);
                        return new i72.g(context5, (k72.b) oaVar.f113900rg.get(), new c72.u(oaVar.g2(), oaVar.a3()), new n72.a(), oaVar.a3());
                    case 846:
                        pq2.d1 retrofit8 = oa.m0(oaVar);
                        Intrinsics.checkNotNullParameter(retrofit8, "retrofit");
                        Object b18 = retrofit8.b(k72.b.class);
                        Intrinsics.checkNotNullExpressionValue(b18, "create(...)");
                        k72.b bVar2 = (k72.b) b18;
                        dl2.b.I(bVar2);
                        return bVar2;
                    case 847:
                        Context context6 = oaVar.f113603b.f67746a;
                        dl2.b.I(context6);
                        return new h72.b(context6, new n72.a());
                    case 848:
                        Context context7 = oaVar.f113603b.f67746a;
                        dl2.b.I(context7);
                        return new i72.i(context7, (k72.e) oaVar.f113954ug.get(), new n72.a());
                    case 849:
                        pq2.d1 retrofit9 = oa.m0(oaVar);
                        Intrinsics.checkNotNullParameter(retrofit9, "retrofit");
                        Object b19 = retrofit9.b(k72.e.class);
                        Intrinsics.checkNotNullExpressionValue(b19, "create(...)");
                        k72.e eVar2 = (k72.e) b19;
                        dl2.b.I(eVar2);
                        return eVar2;
                    case 850:
                        return new i62.c((j62.b) oaVar.f113990wg.get());
                    case 851:
                        Context context8 = oaVar.f113603b.f67746a;
                        dl2.b.I(context8);
                        return new aa0.d(context8, oaVar.h2(), new lh0.h0((lh0.z0) oaVar.D0.get()));
                    case 852:
                        return new i62.e((j62.d) oaVar.f114026yg.get());
                    case 853:
                        return new aa0.g();
                    case 854:
                        return new i62.d(new aa0.f());
                    case 855:
                        Context context9 = oaVar.f113603b.f67746a;
                        dl2.b.I(context9);
                        return new q62.a(context9);
                    case 856:
                        return new np1.b();
                    case 857:
                        pq2.d1 retrofit10 = (pq2.d1) oaVar.W3.get();
                        Intrinsics.checkNotNullParameter(retrofit10, "retrofit");
                        Object b23 = retrofit10.b(b22.a.class);
                        Intrinsics.checkNotNullExpressionValue(b23, "create(...)");
                        b22.a aVar4 = (b22.a) b23;
                        dl2.b.I(aVar4);
                        return aVar4;
                    case 858:
                        PinDeserializer pinDeserializer = (PinDeserializer) oaVar.W2.get();
                        b22.b pinFeedJsonDeserializableAdapter = (b22.b) oaVar.Y2.get();
                        wz.a adsPromotionsTokenJsonDeserializableAdapter = (wz.a) oaVar.Eg.get();
                        Intrinsics.checkNotNullParameter(pinDeserializer, "pinDeserializer");
                        Intrinsics.checkNotNullParameter(pinFeedJsonDeserializableAdapter, "pinFeedJsonDeserializableAdapter");
                        Intrinsics.checkNotNullParameter(adsPromotionsTokenJsonDeserializableAdapter, "adsPromotionsTokenJsonDeserializableAdapter");
                        rz.e eVar3 = new rz.e();
                        eVar3.a(n60.o.f(vd0.c.class, "get(...)"), rz.f.f110230a);
                        TypeToken typeToken = new TypeToken(com.pinterest.api.model.r2.class);
                        Intrinsics.checkNotNullExpressionValue(typeToken, "get(...)");
                        eVar3.a(typeToken, z02.b.f140583a);
                        TypeToken typeToken2 = new TypeToken(PinFeed.class);
                        Intrinsics.checkNotNullExpressionValue(typeToken2, "get(...)");
                        eVar3.a(typeToken2, pinFeedJsonDeserializableAdapter);
                        TypeToken typeToken3 = new TypeToken(f30.class);
                        Intrinsics.checkNotNullExpressionValue(typeToken3, "get(...)");
                        eVar3.a(typeToken3, new e00.a(pinDeserializer));
                        TypeToken typeToken4 = new TypeToken(com.pinterest.api.model.p2.class);
                        Intrinsics.checkNotNullExpressionValue(typeToken4, "get(...)");
                        eVar3.a(typeToken4, new sz.a(1));
                        TypeToken typeToken5 = new TypeToken(com.pinterest.api.model.v1.class);
                        Intrinsics.checkNotNullExpressionValue(typeToken5, "get(...)");
                        eVar3.a(typeToken5, adsPromotionsTokenJsonDeserializableAdapter);
                        return eVar3;
                    case 859:
                        return new wz.a();
                    case 860:
                        return new nt.n();
                    case 861:
                        return new nt.z0((lb0.r) oaVar.f113622c1.get());
                    case 862:
                        return new nt.o1();
                    case 863:
                        pq2.d1 retrofit11 = (pq2.d1) oaVar.f113707gf.get();
                        Intrinsics.checkNotNullParameter(retrofit11, "retrofit");
                        Object b24 = retrofit11.b(o02.a.class);
                        Intrinsics.checkNotNullExpressionValue(b24, "create(...)");
                        o02.a aVar5 = (o02.a) b24;
                        dl2.b.I(aVar5);
                        return aVar5;
                    case 864:
                        return new z82.k();
                    default:
                        throw new AssertionError(i13);
                }
                return jVar;
            default:
                throw new AssertionError(i13);
        }
    }

    public final Object h() {
        rz.f fVar = rz.f.f110230a;
        m60.f0 f0Var = vb0.j.f125466a;
        oa oaVar = this.f113568a;
        int i13 = this.f113569b;
        switch (i13) {
            case 700:
                fl1.f fVar2 = (fl1.f) oaVar.Bd.get();
                a02.e.i3(fVar2);
                return fVar2;
            case 701:
                return new fl1.f();
            case 702:
                return new g11.a((nx.d1) oaVar.f113730i2.get(), (nx.f0) oaVar.f113747j2.get(), (nx.b0) oaVar.R8.get());
            case 703:
                return new j12.b((x02.z0) oaVar.B3.get());
            case 704:
                return a02.e.R1((pq2.d1) oaVar.Id.get());
            case 705:
                return a02.e.c4((pq2.c1) oaVar.f113623c2.get(), new p00.d(), (rz.c) oaVar.f114011y1.get(), oaVar.J2(), (l12.a) oaVar.Gd.get(), (y12.a) oaVar.Hd.get());
            case 706:
                return new l12.a((ModelDeserializerWithSave) oaVar.f113996x4.get());
            case 707:
                return new y12.a((qh) oaVar.f114013y3.get());
            case 708:
                dl1.p localDataSource = (dl1.p) oaVar.Kd.get();
                dl1.a0 remoteDataSource = (dl1.a0) oaVar.Ld.get();
                dl1.z persistencePolicy = (dl1.z) oaVar.Md.get();
                gl1.d repositorySchedulerPolicy = (gl1.d) oaVar.Nd.get();
                Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
                Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
                Intrinsics.checkNotNullParameter(persistencePolicy, "persistencePolicy");
                Intrinsics.checkNotNullParameter(repositorySchedulerPolicy, "repositorySchedulerPolicy");
                return new x02.a1(localDataSource, remoteDataSource, persistencePolicy, repositorySchedulerPolicy, null, null, null, null, null, null, null, null, null, null, 32752);
            case 709:
                gw modelHelper = l10.b.a();
                Intrinsics.checkNotNullParameter(modelHelper, "modelHelper");
                new p10.j();
                p10.m a13 = p10.j.a();
                Intrinsics.checkNotNullExpressionValue(a13, "buildExploreArticleLocalDataSource(...)");
                return a13;
            case 710:
                i12.b retrofitDataSource = new i12.b((l12.b) oaVar.Jd.get());
                Intrinsics.checkNotNullParameter(retrofitDataSource, "retrofitDataSource");
                return retrofitDataSource;
            case 711:
                x02.v policy = new x02.v(1);
                Intrinsics.checkNotNullParameter(policy, "policy");
                return policy;
            case 712:
                return new gl1.c(null, 7);
            case 713:
                lh0.o oVar = (lh0.o) oaVar.f113769k7.get();
                ik1.g gVar = (ik1.g) oaVar.Pd.get();
                dl2.b.I(f0Var);
                return new is1.h(oVar, gVar, f0Var);
            case 714:
                lh0.o oVar2 = (lh0.o) oaVar.f113769k7.get();
                se2.a a14 = bf2.b.a(oaVar.N1);
                ao2.j0 j0Var = (ao2.j0) oaVar.G0.get();
                dl2.b.I(f0Var);
                return new ik1.g(oVar2, a14, j0Var, f0Var);
            case 715:
                pq2.c1 c1Var = (pq2.c1) oaVar.f113623c2.get();
                p00.b z33 = a02.e.z3(a02.e.j3((b22.b) oaVar.Y2.get()), new p00.d());
                rz.c adapterFactory = (rz.c) oaVar.f114011y1.get();
                rq2.a n13 = n60.o.n(oaVar, c1Var, "retrofit", z33, "converterFactory");
                Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
                n60.o.u(n13, "gsonConverterFactory", c1Var, adapterFactory, z33);
                z12.c cVar = (z12.c) n60.o.h(c1Var, n13, z12.c.class, "create(...)");
                dl2.b.I(cVar);
                return cVar;
            case 716:
                return new x02.u((dl1.p) oaVar.Td.get(), (dl1.a0) oaVar.Yd.get(), (dl1.z) oaVar.f113600ae.get(), (gl1.d) oaVar.be.get(), bf2.b.a(oaVar.F3), (lb0.r) oaVar.f113622c1.get());
            case 717:
                dl1.t0 stubLocalDataSource = (dl1.t0) oaVar.Sd.get();
                Intrinsics.checkNotNullParameter(stubLocalDataSource, "stubLocalDataSource");
                dl2.b.I(stubLocalDataSource);
                return stubLocalDataSource;
            case 718:
                return new dl1.t0();
            case 719:
                a12.c remoteDataSource2 = new a12.c((a12.d) oaVar.Xd.get(), (nm.o) oaVar.f113833o0.get());
                Intrinsics.checkNotNullParameter(remoteDataSource2, "remoteDataSource");
                return remoteDataSource2;
            case 720:
                pq2.c1 c1Var2 = (pq2.c1) oaVar.f113623c2.get();
                p00.b t33 = a02.e.t3((rz.e) oaVar.Wd.get(), new p00.d());
                rz.c apiCallAdapterFactory = (rz.c) oaVar.f114011y1.get();
                rq2.a n14 = n60.o.n(oaVar, c1Var2, "retrofitBuilder", t33, "pinterestJsonObjectConverterFactory");
                Intrinsics.checkNotNullParameter(apiCallAdapterFactory, "apiCallAdapterFactory");
                n60.o.u(n14, "gsonConverterFactory", c1Var2, apiCallAdapterFactory, t33);
                a12.d dVar = (a12.d) n60.o.h(c1Var2, n14, a12.d.class, "create(...)");
                dl2.b.I(dVar);
                return dVar;
            case 721:
                a12.a aggregatedCommentJsonDeserializableAdapter = (a12.a) oaVar.Ud.get();
                tz.a aggregatedCommentFeedJsonDeserializableAdapter = (tz.a) oaVar.Vd.get();
                l22.d userDidItDataJsonDeserializableAdapter = (l22.d) oaVar.f113790la.get();
                Intrinsics.checkNotNullParameter(aggregatedCommentJsonDeserializableAdapter, "aggregatedCommentJsonDeserializableAdapter");
                Intrinsics.checkNotNullParameter(aggregatedCommentFeedJsonDeserializableAdapter, "aggregatedCommentFeedJsonDeserializableAdapter");
                Intrinsics.checkNotNullParameter(userDidItDataJsonDeserializableAdapter, "userDidItDataJsonDeserializableAdapter");
                rz.e eVar = new rz.e();
                TypeToken typeToken = new TypeToken(com.pinterest.api.model.z2.class);
                Intrinsics.checkNotNullExpressionValue(typeToken, "get(...)");
                eVar.a(typeToken, aggregatedCommentJsonDeserializableAdapter);
                TypeToken typeToken2 = new TypeToken(AggregatedCommentFeed.class);
                Intrinsics.checkNotNullExpressionValue(typeToken2, "get(...)");
                eVar.a(typeToken2, aggregatedCommentFeedJsonDeserializableAdapter);
                TypeToken typeToken3 = new TypeToken(az0.class);
                Intrinsics.checkNotNullExpressionValue(typeToken3, "get(...)");
                eVar.a(typeToken3, userDidItDataJsonDeserializableAdapter);
                TypeToken typeToken4 = new TypeToken(vd0.c.class);
                Intrinsics.checkNotNullExpressionValue(typeToken4, "get(...)");
                eVar.a(typeToken4, fVar);
                return eVar;
            case 722:
                return new a12.a((ke0.a) oaVar.Fc.get());
            case 723:
                return new tz.a((ke0.b) oaVar.Fc.get());
            case 724:
                fl1.f policy2 = (fl1.f) oaVar.Zd.get();
                Intrinsics.checkNotNullParameter(policy2, "policy");
                dl2.b.I(policy2);
                return policy2;
            case 725:
                return new fl1.f();
            case 726:
                return new gl1.c(null, 7);
            case 727:
                dl1.t0 localDataSource2 = (dl1.t0) oaVar.f113738ia.get();
                a02.e.J2(localDataSource2);
                dl1.a0 remoteDataSource3 = (dl1.a0) oaVar.f113652de.get();
                fl1.f persistencePolicy2 = new fl1.f();
                gl1.c repositorySchedulerPolicy2 = new gl1.c(null, 7);
                Intrinsics.checkNotNullParameter(localDataSource2, "localDataSource");
                Intrinsics.checkNotNullParameter(remoteDataSource3, "remoteDataSource");
                Intrinsics.checkNotNullParameter(persistencePolicy2, "persistencePolicy");
                Intrinsics.checkNotNullParameter(repositorySchedulerPolicy2, "repositorySchedulerPolicy");
                return new x02.p1(localDataSource2, remoteDataSource3, persistencePolicy2, repositorySchedulerPolicy2, null, null, null, null, null, null, null, null, null, null, 32752);
            case AdSize.LEADERBOARD_WIDTH /* 728 */:
                s12.b remoteDataSource4 = new s12.b((l22.a) oaVar.f113825na.get(), (x02.x2) oaVar.f113800m3.get(), (b60.b) oaVar.f113850p0.get(), (nm.o) oaVar.f113833o0.get());
                Intrinsics.checkNotNullParameter(remoteDataSource4, "remoteDataSource");
                return remoteDataSource4;
            case 729:
                return new ax.b();
            case 730:
                lh0.o oVar3 = (lh0.o) oaVar.f113769k7.get();
                dl2.b.I(f0Var);
                return new r01.a(oVar3, f0Var);
            case 731:
                return new vt1.a();
            case 732:
                return new i91.z(oaVar.b3(), (b60.b) oaVar.f113850p0.get());
            case 733:
                return new is1.g((lb0.q) oaVar.O0.get());
            case 734:
                lh0.z0 experimentsActivator = (lh0.z0) oaVar.D0.get();
                kz1.a powerscoreCalculator = (kz1.a) oaVar.D6.get();
                Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
                Intrinsics.checkNotNullParameter(powerscoreCalculator, "powerscoreCalculator");
                return new kv.c("android_organic_audio_control_on_grid", experimentsActivator, powerscoreCalculator);
            case 735:
                return new w21.b0();
            case 736:
                dl1.t0 localDataSource3 = (dl1.t0) oaVar.f113811me.get();
                a02.e.K2(localDataSource3);
                b12.a remoteDataSource5 = new b12.a((a12.d) oaVar.Xd.get(), (uj2.a0) oaVar.Y3.get(), (uj2.a0) oaVar.Z3.get());
                Intrinsics.checkNotNullParameter(remoteDataSource5, "remoteDataSource");
                m60.g0 pageSizeProvider = (m60.g0) oaVar.f113590a4.get();
                a02.e.d3(pageSizeProvider);
                Intrinsics.checkNotNullParameter(localDataSource3, "localDataSource");
                Intrinsics.checkNotNullParameter(remoteDataSource5, "remoteDataSource");
                Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
                return new x02.c(localDataSource3, remoteDataSource5, new fl1.f(), pageSizeProvider, 0);
            case 737:
                return new dl1.t0();
            case 738:
                return new x02.l2((dl1.p) oaVar.f113847oe.get(), (dl1.a0) oaVar.f113864pe.get(), (dl1.z) oaVar.f113882qe.get(), (gl1.d) oaVar.f113898re.get());
            case 739:
                return new dl1.t0();
            case 740:
                j22.j retrofitDataSource2 = new j22.j((j22.b) oaVar.U3.get(), hf0.b.q());
                Intrinsics.checkNotNullParameter(retrofitDataSource2, "retrofitDataSource");
                return retrofitDataSource2;
            case 741:
                return new fl1.f();
            case 742:
                return new gl1.c(null, 7);
            case 743:
                return new ConversationMessageDeserializer(bf2.b.a(oaVar.De), (d12.i) oaVar.N2.get(), (fl1.e) oaVar.Ee.get());
            case 744:
                x02.e1 repository = (x02.e1) oaVar.Ce.get();
                Intrinsics.checkNotNullParameter(repository, "repository");
                dl2.b.I(repository);
                return repository;
            case 745:
                dl1.p localDataSource4 = (dl1.p) oaVar.f113934te.get();
                dl1.a0 remoteDataSource6 = (dl1.a0) oaVar.f114042ze.get();
                dl1.z persistencePolicy3 = (dl1.z) oaVar.Ae.get();
                gl1.d repositorySchedulerPolicy3 = (gl1.d) oaVar.Be.get();
                Intrinsics.checkNotNullParameter(localDataSource4, "localDataSource");
                Intrinsics.checkNotNullParameter(remoteDataSource6, "remoteDataSource");
                Intrinsics.checkNotNullParameter(persistencePolicy3, "persistencePolicy");
                Intrinsics.checkNotNullParameter(repositorySchedulerPolicy3, "repositorySchedulerPolicy");
                Intrinsics.checkNotNullParameter(localDataSource4, "localDataSource");
                Intrinsics.checkNotNullParameter(remoteDataSource6, "remoteDataSource");
                Intrinsics.checkNotNullParameter(persistencePolicy3, "persistencePolicy");
                Intrinsics.checkNotNullParameter(repositorySchedulerPolicy3, "repositorySchedulerPolicy");
                return new x02.e1(localDataSource4, remoteDataSource6, persistencePolicy3, repositorySchedulerPolicy3, null, null, null, null, null, null, null, null, null, null, 32752);
            case 746:
                gw modelHelper2 = l10.b.a();
                Intrinsics.checkNotNullParameter(modelHelper2, "modelHelper");
                new p10.h();
                p10.m a15 = p10.h.a();
                Intrinsics.checkNotNullExpressionValue(a15, "buildConversationMessageLocalDataSource(...)");
                return a15;
            case 747:
                se2.a retrofit = bf2.b.a(oaVar.f114024ye);
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Object obj = ((bf2.b) retrofit).get();
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                dl1.a0 a0Var = (dl1.a0) obj;
                dl2.b.I(a0Var);
                return a0Var;
            case 748:
                return new r12.a((r12.b) oaVar.f114006xe.get());
            case 749:
                pq2.c1 retrofit3 = (pq2.c1) oaVar.f113623c2.get();
                rz.c adapterFactory2 = (rz.c) oaVar.f114011y1.get();
                rq2.a gsonConverterFactory = oaVar.J2();
                p00.b converterFactory = (p00.b) oaVar.f113988we.get();
                Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                Intrinsics.checkNotNullParameter(adapterFactory2, "adapterFactory");
                Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                retrofit3.a(adapterFactory2);
                retrofit3.b(converterFactory);
                r12.b bVar = (r12.b) n60.o.h(retrofit3, gsonConverterFactory, r12.b.class, "create(...)");
                dl2.b.I(bVar);
                return bVar;
            case 750:
                p00.d bodyConverter = new p00.d();
                rz.e registry = (rz.e) oaVar.f113970ve.get();
                Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
                Intrinsics.checkNotNullParameter(registry, "registry");
                return new p00.b(registry, bodyConverter, null);
            case 751:
                ConversationMessageDeserializer conversationMessageDeserializer = (ConversationMessageDeserializer) oaVar.f113952ue.get();
                Intrinsics.checkNotNullParameter(conversationMessageDeserializer, "conversationMessageDeserializer");
                rz.e eVar2 = new rz.e();
                eVar2.a(n60.o.f(mv.class, "get(...)"), new wr0.x(conversationMessageDeserializer));
                TypeToken typeToken5 = new TypeToken(vd0.c.class);
                Intrinsics.checkNotNullExpressionValue(typeToken5, "get(...)");
                eVar2.a(typeToken5, fVar);
                return eVar2;
            case 752:
                return new fl1.a();
            case 753:
                return new gl1.c(null, 7);
            case 754:
                return new xe();
            case 755:
                return new kq0.d((nm.o) oaVar.f113833o0.get(), (tb0.h) oaVar.f113797m0.get(), (f30.b) oaVar.V1.get());
            case 756:
                return new cp.a0((lb0.r) oaVar.f113622c1.get());
            case 757:
                pq2.c1 c1Var3 = (pq2.c1) oaVar.f113623c2.get();
                p00.b bVar2 = (p00.b) oaVar.Ie.get();
                rz.c adapterFactory3 = (rz.c) oaVar.f114011y1.get();
                rq2.a n15 = n60.o.n(oaVar, c1Var3, "retrofit", bVar2, "converterFactory");
                Intrinsics.checkNotNullParameter(adapterFactory3, "adapterFactory");
                n60.o.u(n15, "gsonConverterFactory", c1Var3, adapterFactory3, bVar2);
                k12.a aVar = (k12.a) n60.o.h(c1Var3, n15, k12.a.class, "create(...)");
                dl2.b.I(aVar);
                return aVar;
            case 758:
                rz.e eVar3 = (rz.e) oaVar.He.get();
                return new p00.b(eVar3, n60.o.k(eVar3, "registry", "requestBodyConverter"), null);
            case 759:
                return new rz.e();
            case 760:
                pq2.c1 c1Var4 = (pq2.c1) oaVar.f113623c2.get();
                p00.b A1 = a02.e.A1((rz.e) oaVar.Ke.get(), new p00.d());
                rz.c adapterFactory4 = (rz.c) oaVar.f114011y1.get();
                rq2.a n16 = n60.o.n(oaVar, c1Var4, "retrofit", A1, "converterFactory");
                Intrinsics.checkNotNullParameter(adapterFactory4, "adapterFactory");
                n60.o.u(n16, "gsonConverterFactory", c1Var4, adapterFactory4, A1);
                d20.a aVar2 = (d20.a) n60.o.h(c1Var4, n16, d20.a.class, "create(...)");
                dl2.b.I(aVar2);
                return aVar2;
            case 761:
                rz.e eVar4 = new rz.e();
                TypeToken typeToken6 = new TypeToken(vd0.c.class);
                Intrinsics.checkNotNullExpressionValue(typeToken6, "get(...)");
                eVar4.a(typeToken6, fVar);
                TypeToken typeToken7 = new TypeToken(com.pinterest.api.model.o4.class);
                Intrinsics.checkNotNullExpressionValue(typeToken7, "get(...)");
                eVar4.a(typeToken7, uz.a.f123271a);
                TypeToken typeToken8 = new TypeToken(com.pinterest.api.model.xb.class);
                Intrinsics.checkNotNullExpressionValue(typeToken8, "get(...)");
                eVar4.a(typeToken8, new sz.a(2));
                return eVar4;
            case 762:
                oaVar.getClass();
                return new is1.l(new b20.c(new lh0.d2((lh0.z0) oaVar.D0.get())), (tb0.h) oaVar.f113797m0.get(), (gz1.b) oaVar.C1.get(), (lb0.q) oaVar.O0.get());
            case 763:
                pq2.c1 c1Var5 = (pq2.c1) oaVar.f113623c2.get();
                p00.b bVar3 = (p00.b) oaVar.Oe.get();
                rz.c adapterFactory5 = (rz.c) oaVar.f114011y1.get();
                rq2.a n17 = n60.o.n(oaVar, c1Var5, "retrofit", bVar3, "converterFactory");
                Intrinsics.checkNotNullParameter(adapterFactory5, "adapterFactory");
                n60.o.u(n17, "gsonConverterFactory", c1Var5, adapterFactory5, bVar3);
                p20.a aVar3 = (p20.a) n60.o.h(c1Var5, n17, p20.a.class, "create(...)");
                dl2.b.I(aVar3);
                return aVar3;
            case 764:
                rz.e registry2 = (rz.e) oaVar.Ne.get();
                p00.c bodyConverter2 = (p00.c) oaVar.f113651dd.get();
                Intrinsics.checkNotNullParameter(registry2, "registry");
                Intrinsics.checkNotNullParameter(bodyConverter2, "bodyConverter");
                return new p00.b(registry2, bodyConverter2, null);
            case 765:
                rz.e eVar5 = new rz.e();
                eVar5.a(n60.o.f(vv.class, "get(...)"), c00.a.f24410a);
                return eVar5;
            case 766:
                wr.d adFormatsLogger = oaVar.X1();
                lh0.j adsLibraryExperiments = oa.g0(oaVar);
                Intrinsics.checkNotNullParameter(adFormatsLogger, "adFormatsLogger");
                Intrinsics.checkNotNullParameter(adsLibraryExperiments, "adsLibraryExperiments");
                return new qs.g(adFormatsLogger, adsLibraryExperiments);
            case 767:
                return new h22.e();
            case 768:
                pq2.c1 c1Var6 = (pq2.c1) oaVar.f113623c2.get();
                p00.b bVar4 = (p00.b) oaVar.L5.get();
                rz.c adapterFactory6 = (rz.c) oaVar.f114011y1.get();
                rq2.a n18 = n60.o.n(oaVar, c1Var6, "retrofit", bVar4, "converterFactory");
                Intrinsics.checkNotNullParameter(adapterFactory6, "adapterFactory");
                n60.o.u(n18, "gsonConverterFactory", c1Var6, adapterFactory6, bVar4);
                f20.a aVar4 = (f20.a) n60.o.h(c1Var6, n18, f20.a.class, "create(...)");
                dl2.b.I(aVar4);
                return aVar4;
            case 769:
                return new x02.w1();
            case 770:
                d00.a newsHubItemFeedJsonDeserializableAdapter = (d00.a) oaVar.Ue.get();
                d00.b newsHubItemJsonDeserializableAdapter = (d00.b) oaVar.Ve.get();
                Intrinsics.checkNotNullParameter(newsHubItemFeedJsonDeserializableAdapter, "newsHubItemFeedJsonDeserializableAdapter");
                Intrinsics.checkNotNullParameter(newsHubItemJsonDeserializableAdapter, "newsHubItemJsonDeserializableAdapter");
                rz.e eVar6 = new rz.e();
                TypeToken typeToken9 = new TypeToken(NewsHubItemFeed.class);
                Intrinsics.checkNotNullExpressionValue(typeToken9, "get(...)");
                eVar6.a(typeToken9, newsHubItemFeedJsonDeserializableAdapter);
                TypeToken typeToken10 = new TypeToken(qx.class);
                Intrinsics.checkNotNullExpressionValue(typeToken10, "get(...)");
                eVar6.a(typeToken10, newsHubItemJsonDeserializableAdapter);
                TypeToken typeToken11 = new TypeToken(vd0.c.class);
                Intrinsics.checkNotNullExpressionValue(typeToken11, "get(...)");
                eVar6.a(typeToken11, fVar);
                return eVar6;
            case 771:
                return new d00.a((ke0.b) oaVar.Jc.get());
            case 772:
                return new d00.b((NewsHubItemDeserializer) oaVar.Jc.get());
            case 773:
                return new PearQuizDeserializer();
            case 774:
                return new PearQuizOutputDeserializer();
            case 775:
                return new c22.a();
            case 776:
                return new vx.d();
            case 777:
                return new vx.c((nx.o0) oaVar.T1.get(), (vx.d) oaVar.f113601af.get(), (ha) oaVar.f113618bf.get());
            case 778:
                return new ha();
            case 779:
                x02.x2 userRepository = (x02.x2) oaVar.f113783l3.get();
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                return userRepository.e0();
            case 780:
                return new my1.a();
            case 781:
                pq2.d1 retrofit4 = (pq2.d1) oaVar.f113707gf.get();
                Intrinsics.checkNotNullParameter(retrofit4, "retrofit");
                Object b13 = retrofit4.b(i02.a.class);
                Intrinsics.checkNotNullExpressionValue(b13, "create(...)");
                i02.a aVar5 = (i02.a) b13;
                dl2.b.I(aVar5);
                return aVar5;
            case 782:
                pq2.c1 c1Var7 = (pq2.c1) oaVar.f113623c2.get();
                p00.b bVar5 = (p00.b) oaVar.f113689ff.get();
                rz.c adapterFactory7 = (rz.c) oaVar.f114011y1.get();
                rq2.a n19 = n60.o.n(oaVar, c1Var7, "retrofit", bVar5, "converterFactory");
                Intrinsics.checkNotNullParameter(adapterFactory7, "adapterFactory");
                n60.o.u(n19, "gsonConverterFactory", c1Var7, adapterFactory7, bVar5);
                c1Var7.b(n19);
                pq2.d1 d2 = c1Var7.d();
                Intrinsics.checkNotNullExpressionValue(d2, "build(...)");
                return d2;
            case 783:
                rz.e eVar7 = (rz.e) oaVar.f113714h4.get();
                return new p00.b(eVar7, n60.o.k(eVar7, "registry", "bodyConverter"), null);
            case 784:
                return new y61.a((m60.w) oaVar.f113885r0.get());
            case 785:
                return new eb1.e(new ll.j((r20.a) oaVar.f113794lf.get()));
            case 786:
                pq2.c1 c1Var8 = (pq2.c1) oaVar.f113623c2.get();
                return a02.e.Y2((rz.c) oaVar.f114011y1.get(), (p00.b) oaVar.f113777kf.get(), c1Var8, oaVar.J2());
            case 787:
                rz.e eVar8 = (rz.e) oaVar.f113759jf.get();
                return new p00.b(eVar8, n60.o.k(eVar8, "registry", "bodyConverter"), null);
            case 788:
                rz.e eVar9 = new rz.e();
                TypeToken typeToken12 = new TypeToken(vd0.c.class);
                Intrinsics.checkNotNullExpressionValue(typeToken12, "get(...)");
                eVar9.a(typeToken12, fVar);
                return eVar9;
            case 789:
                pq2.c1 retrofit5 = (pq2.c1) oaVar.f113623c2.get();
                rz.c adapterFactory8 = (rz.c) oaVar.f114011y1.get();
                rq2.a gsonConverterFactory2 = oaVar.J2();
                p00.b converterFactory2 = oa.O0(oaVar);
                Intrinsics.checkNotNullParameter(retrofit5, "retrofit");
                Intrinsics.checkNotNullParameter(adapterFactory8, "adapterFactory");
                Intrinsics.checkNotNullParameter(gsonConverterFactory2, "gsonConverterFactory");
                Intrinsics.checkNotNullParameter(converterFactory2, "converterFactory");
                retrofit5.a(adapterFactory8);
                retrofit5.b(converterFactory2);
                x10.a aVar6 = (x10.a) n60.o.h(retrofit5, gsonConverterFactory2, x10.a.class, "create(...)");
                dl2.b.I(aVar6);
                return aVar6;
            case 790:
                return new n00.s();
            case 791:
                dl1.p localDataSource5 = (dl1.p) oaVar.f113953uf.get();
                dl1.a0 remoteDataSource7 = (dl1.a0) oaVar.f113971vf.get();
                dl1.z persistencePolicy4 = (dl1.z) oaVar.f113989wf.get();
                gl1.d repositorySchedulerPolicy4 = (gl1.d) oaVar.f114007xf.get();
                Intrinsics.checkNotNullParameter(localDataSource5, "localDataSource");
                Intrinsics.checkNotNullParameter(remoteDataSource7, "remoteDataSource");
                Intrinsics.checkNotNullParameter(persistencePolicy4, "persistencePolicy");
                Intrinsics.checkNotNullParameter(repositorySchedulerPolicy4, "repositorySchedulerPolicy");
                return new d81.b(localDataSource5, remoteDataSource7, persistencePolicy4, repositorySchedulerPolicy4, null, null, null, null, null, null, null, null, null, null, 32752);
            case 792:
                return new d81.c((b60.b) oaVar.f113850p0.get(), (y71.c) oaVar.f113935tf.get());
            case 793:
                w71.d collageDraftsDao = (w71.d) oaVar.qf.get();
                w71.i collagePageDao = (w71.i) oaVar.f113899rf.get();
                w71.g collageItemDao = (w71.g) oaVar.f113917sf.get();
                Intrinsics.checkNotNullParameter(collageDraftsDao, "collageDraftsDao");
                Intrinsics.checkNotNullParameter(collagePageDao, "collagePageDao");
                Intrinsics.checkNotNullParameter(collageItemDao, "collageItemDao");
                return new y71.c(collageDraftsDao, collagePageDao, collageItemDao);
            case 794:
                CollageDatabase pinterestDatabase = (CollageDatabase) oaVar.f113865pf.get();
                Intrinsics.checkNotNullParameter(pinterestDatabase, "pinterestDatabase");
                w71.d t13 = pinterestDatabase.t();
                dl2.b.I(t13);
                return t13;
            case 795:
                Context context = (Context) oaVar.f113902s0.get();
                Intrinsics.checkNotNullParameter(context, "applicationContext");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter("collages-db", "name");
                ja.a0 a16 = se.l.a(context, CollageDatabase.class, "collages-db");
                gi2.b collageGson = new gi2.b();
                Intrinsics.checkNotNullParameter(collageGson, "collageGson");
                v71.a typeConverter = new v71.a();
                Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
                ArrayList arrayList = a16.f75156e;
                arrayList.add(typeConverter);
                v71.c typeConverter2 = new v71.c(new gi2.b());
                Intrinsics.checkNotNullParameter(typeConverter2, "typeConverter");
                arrayList.add(typeConverter2);
                return (CollageDatabase) a16.b();
            case 796:
                CollageDatabase pinterestDatabase2 = (CollageDatabase) oaVar.f113865pf.get();
                Intrinsics.checkNotNullParameter(pinterestDatabase2, "pinterestDatabase");
                w71.i v13 = pinterestDatabase2.v();
                dl2.b.I(v13);
                return v13;
            case 797:
                CollageDatabase pinterestDatabase3 = (CollageDatabase) oaVar.f113865pf.get();
                Intrinsics.checkNotNullParameter(pinterestDatabase3, "pinterestDatabase");
                w71.g u13 = pinterestDatabase3.u();
                dl2.b.I(u13);
                return u13;
            case 798:
                return new d81.a();
            case 799:
                fl1.a policy3 = (fl1.a) oaVar.T2.get();
                Intrinsics.checkNotNullParameter(policy3, "policy");
                dl2.b.I(policy3);
                return policy3;
            default:
                throw new AssertionError(i13);
        }
    }
}
