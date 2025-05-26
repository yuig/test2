package zq;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.pinterest.framework.multisection.datasource.pagedlist.h;
import com.pinterest.gestalt.button.view.GestaltButton;
import hs1.m;
import hs1.q;
import java.math.BigInteger;
import java.util.ArrayList;
import jk2.x;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;
import ll.j;
import net.quikkly.android.render.AndroidSkinBuilder;
import net.quikkly.android.ui.RenderTagView;
import pk.a0;
import rq.a4;
import x02.x2;
import yk1.r;
import yk1.t;
import yq.i;
import yq.l;
import yq.n;

/* loaded from: classes3.dex */
public final class f extends t implements l {

    /* renamed from: a, reason: collision with root package name */
    public final String f142639a;

    /* renamed from: b, reason: collision with root package name */
    public final n f142640b;

    /* renamed from: c, reason: collision with root package name */
    public final int f142641c;

    /* renamed from: d, reason: collision with root package name */
    public final e12.d f142642d;

    /* renamed from: e, reason: collision with root package name */
    public final x2 f142643e;

    /* renamed from: f, reason: collision with root package name */
    public final j f142644f;

    /* renamed from: g, reason: collision with root package name */
    public BigInteger f142645g;

    /* renamed from: h, reason: collision with root package name */
    public b f142646h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f142647i;

    /* renamed from: j, reason: collision with root package name */
    public final q f142648j;

    /* renamed from: k, reason: collision with root package name */
    public final int f142649k;

    /* renamed from: l, reason: collision with root package name */
    public final e f142650l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String pincodeId, n pincodeType, int i13, uk1.e pinalyticsFactory, uj2.q networkStateStream, e12.d boardService, x2 userRepository, j pincodesUtil) {
        super(((uk1.a) pinalyticsFactory).g(), networkStateStream);
        Intrinsics.checkNotNullParameter(pincodeId, "pincodeId");
        Intrinsics.checkNotNullParameter(pincodeType, "pincodeType");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(boardService, "boardService");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(pincodesUtil, "pincodesUtil");
        this.f142639a = pincodeId;
        this.f142640b = pincodeType;
        this.f142641c = i13;
        this.f142642d = boardService;
        this.f142643e = userRepository;
        this.f142644f = pincodesUtil;
        this.f142647i = new ArrayList();
        this.f142648j = hs1.t.a();
        this.f142649k = (int) (hf0.b.f69002b / 2);
        this.f142650l = new e(this);
    }

    public final void p3(String str) {
        b bVar = new b(this, 1);
        if (str != null) {
            ((m) this.f142648j).k(str, bVar, null, null);
            return;
        }
        Bitmap q33 = q3();
        if (q33 != null) {
            s3(q33);
        }
    }

    public final Bitmap q3() {
        Drawable I = com.bumptech.glide.c.I(((i) ((yq.m) getView())).getContext(), fz1.c.ic_pincode_default_image_nonpds);
        Bitmap bitmap = null;
        if (I == null) {
            return null;
        }
        try {
            bitmap = Bitmap.createBitmap(I.getIntrinsicWidth(), I.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            I.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            I.draw(canvas);
            return bitmap;
        } catch (NullPointerException | OutOfMemoryError e13) {
            if (e13.getMessage() == null) {
                return bitmap;
            }
            e13.getMessage();
            return bitmap;
        }
    }

    @Override // yk1.p
    public final void r3(yq.m view) {
        l lVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        i iVar = (i) view;
        Intrinsics.checkNotNullParameter(this, "pincodeListener");
        iVar.f139660n = this;
        String str = this.f142639a;
        this.f142645g = str.length() == 0 ? BigInteger.ZERO : new BigInteger(str);
        iVar.b();
        int i13 = 0;
        if (j.r(iVar.getContext()) != null) {
            iVar.f139654h.showLoadingSpinner(true);
            n nVar = n.BOARD;
            n nVar2 = iVar.f139650d;
            if (nVar2 == nVar) {
                l lVar2 = iVar.f139660n;
                if (lVar2 != null) {
                    f fVar = (f) lVar2;
                    fVar.f142646h = new b(fVar, i13);
                    ar.b bVar = new ar.b(fVar.f142639a, fVar.f142642d);
                    fVar.clearDisposables();
                    fVar.addDisposable(bVar.prepare(new Object[0]).execute((ak2.e) new xo.a(fVar, 6), (ak2.e) new xo.l(12)));
                }
            } else if (nVar2 == n.USER && (lVar = iVar.f139660n) != null) {
                ((f) lVar).p3(iVar.f139651e);
            }
        }
        if (this.f142640b != n.USER) {
            GestaltButton gestaltButton = iVar.f139659m;
            if (gestaltButton != null) {
                a0.l0(gestaltButton);
                return;
            } else {
                Intrinsics.r("changeImageGestaltButton");
                throw null;
            }
        }
        b60.b bVar2 = iVar.f139664r;
        if (bVar2 == null) {
            Intrinsics.r("activeUserManager");
            throw null;
        }
        if (!Intrinsics.d(com.bumptech.glide.d.Q(bVar2).getUid(), iVar.f139649c)) {
            GestaltButton gestaltButton2 = iVar.f139659m;
            if (gestaltButton2 == null) {
                Intrinsics.r("changeImageGestaltButton");
                throw null;
            }
            a0.l0(gestaltButton2);
        }
        int i14 = 2;
        xj2.c F = new x(this.f142643e.D(), new h(i14, new c(this, 0)), i14).F(new a4(23, new c(this, 1)), new a4(24, d.f142636i), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    public final void s3(Bitmap bitmap) {
        BigInteger data = this.f142645g;
        if (data != null) {
            i iVar = (i) ((yq.m) getView());
            iVar.getClass();
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            Intrinsics.checkNotNullParameter(data, "data");
            AndroidSkinBuilder androidSkinBuilder = new AndroidSkinBuilder();
            iVar.b();
            AndroidSkinBuilder dataColors = androidSkinBuilder.setBackgroundColor(j.m(iVar.getContext(), eo1.b.color_themed_background_elevation_floating)).setDataColors(iVar.f139661o);
            if (dataColors != null) {
                dataColors.setImage(bitmap);
                RenderTagView renderTagView = iVar.f139653g;
                renderTagView.setImageBitmap(bitmap);
                renderTagView.setAll("template0080style1", data, dataColors.build());
                k3.Q1(renderTagView, 0);
                k3.Q1(iVar.f139654h, 8);
            }
        }
    }
}
