package ha;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import com.pinterest.gestalt.popoverMessage.GestaltPopoverMessage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import nt.e2;
import ym1.r;
import ym1.s;
import ym1.t;
import ym1.u;
import ym1.v;
import ym1.w;
import ym1.y;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f68316a;

    /* renamed from: b, reason: collision with root package name */
    public Object f68317b;

    /* renamed from: c, reason: collision with root package name */
    public Object f68318c;

    /* renamed from: d, reason: collision with root package name */
    public Object f68319d;

    /* renamed from: e, reason: collision with root package name */
    public Object f68320e;

    /* renamed from: f, reason: collision with root package name */
    public Object f68321f;

    /* renamed from: g, reason: collision with root package name */
    public Object f68322g;

    /* renamed from: h, reason: collision with root package name */
    public Object f68323h;

    /* renamed from: i, reason: collision with root package name */
    public Object f68324i;

    /* renamed from: j, reason: collision with root package name */
    public Object f68325j;

    /* renamed from: k, reason: collision with root package name */
    public Object f68326k;

    public a() {
        this.f68319d = new Size(0, 0);
    }

    public static ym1.e a(Rect rect, Size size) {
        Rect rect2;
        Rect rect3 = new Rect(0, 0, hf0.b.f69002b, hf0.b.f69003c);
        int i13 = rect3.left;
        int i14 = rect3.top;
        boolean contains = new Rect(i13, i14, rect3.right, (rect3.bottom / 2) + i14).contains(rect);
        int i15 = rect3.left;
        boolean contains2 = new Rect(i15, rect3.top, (rect3.right / 2) + i15, rect3.bottom).contains(rect);
        int i16 = rect3.left;
        int i17 = rect3.right;
        boolean contains3 = new Rect((i17 / 2) + i16, rect3.top, i17, rect3.bottom).contains(rect);
        ArrayList arrayList = new ArrayList();
        if (contains) {
            if (contains2) {
                arrayList.add(ym1.e.TOP_CENTER);
                arrayList.add(ym1.e.TOP_LEFT);
                arrayList.add(ym1.e.LEFT_CENTER);
                arrayList.add(ym1.e.LEFT_TOP);
                arrayList.add(ym1.e.LEFT_BOTTOM);
            } else if (contains3) {
                arrayList.add(ym1.e.TOP_CENTER);
                arrayList.add(ym1.e.TOP_RIGHT);
                arrayList.add(ym1.e.RIGHT_CENTER);
                arrayList.add(ym1.e.RIGHT_TOP);
                arrayList.add(ym1.e.RIGHT_BOTTOM);
            } else {
                arrayList.add(ym1.e.TOP_CENTER);
                arrayList.add(ym1.e.TOP_LEFT);
                arrayList.add(ym1.e.TOP_RIGHT);
            }
        } else if (contains2) {
            arrayList.add(ym1.e.BOTTOM_CENTER);
            arrayList.add(ym1.e.BOTTOM_LEFT);
            arrayList.add(ym1.e.LEFT_CENTER);
            arrayList.add(ym1.e.LEFT_TOP);
            arrayList.add(ym1.e.LEFT_BOTTOM);
        } else if (contains3) {
            arrayList.add(ym1.e.BOTTOM_CENTER);
            arrayList.add(ym1.e.BOTTOM_RIGHT);
            arrayList.add(ym1.e.RIGHT_CENTER);
            arrayList.add(ym1.e.RIGHT_TOP);
            arrayList.add(ym1.e.RIGHT_BOTTOM);
        } else {
            arrayList.add(ym1.e.BOTTOM_CENTER);
            arrayList.add(ym1.e.BOTTOM_LEFT);
            arrayList.add(ym1.e.BOTTOM_RIGHT);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ym1.e eVar = (ym1.e) it.next();
            switch (w.f139458a[eVar.ordinal()]) {
                case 1:
                    rect2 = new Rect(((rect.width() / 2) + rect.left) - (size.getWidth() / 2), rect.bottom, (size.getWidth() / 2) + (rect.width() / 2) + rect.left, size.getHeight() + rect.bottom);
                    break;
                case 2:
                    int width = rect.right - size.getWidth();
                    int i18 = rect.bottom;
                    rect2 = new Rect(width, i18, rect.right, size.getHeight() + i18);
                    break;
                case 3:
                    int i19 = rect.left;
                    rect2 = new Rect(i19, rect.bottom, size.getWidth() + i19, size.getHeight() + rect.bottom);
                    break;
                case 4:
                    rect2 = new Rect(((rect.width() / 2) + rect.left) - (size.getWidth() / 2), rect.top - size.getHeight(), (size.getWidth() / 2) + (rect.width() / 2) + rect.left, rect.top);
                    break;
                case 5:
                    rect2 = new Rect(rect.right - size.getWidth(), rect.top - size.getHeight(), rect.right, rect.top);
                    break;
                case 6:
                    rect2 = new Rect(rect.left, rect.top - size.getHeight(), size.getWidth() + rect.left, rect.top);
                    break;
                case 7:
                    int i23 = rect.right;
                    rect2 = new Rect(i23, rect.top, size.getWidth() + i23, size.getHeight() + rect.top);
                    break;
                case 8:
                    rect2 = new Rect(rect.right, ((rect.height() / 2) + rect.top) - (size.getHeight() / 2), size.getWidth() + rect.right, (size.getHeight() / 2) + (rect.height() / 2) + rect.top);
                    break;
                case 9:
                    int i24 = rect.right;
                    rect2 = new Rect(i24, rect.bottom, size.getWidth() + i24, size.getHeight() + rect.bottom);
                    break;
                case 10:
                    int width2 = rect.left - size.getWidth();
                    int i25 = rect.top;
                    rect2 = new Rect(width2, i25, rect.left, size.getHeight() + i25);
                    break;
                case 11:
                    rect2 = new Rect(rect.left - size.getWidth(), ((rect.height() / 2) + rect.top) - (size.getHeight() / 2), rect.left, (size.getHeight() / 2) + (rect.height() / 2) + rect.top);
                    break;
                case 12:
                    int width3 = rect.left - size.getWidth();
                    int i26 = rect.bottom;
                    rect2 = new Rect(width3, i26, rect.left, size.getHeight() + i26);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            if (rect3.contains(rect2)) {
                return eVar;
            }
        }
        return null;
    }

    public static v b(View view, Size size, ym1.e eVar) {
        switch (w.f139458a[eVar.ordinal()]) {
            case 1:
                return new v(new Point((view.getWidth() / 2) - (size.getWidth() / 2), 0));
            case 2:
                return new v(new Point(((view.getWidth() / 2) - size.getWidth()) + ((int) f(view)), 0));
            case 3:
                return new v(new Point((view.getWidth() / 2) - ((int) f(view)), 0));
            case 4:
                return new v(new Point((view.getWidth() / 2) - (size.getWidth() / 2), (view.getHeight() + size.getHeight()) * (-1)));
            case 5:
                return new v(new Point(((view.getWidth() / 2) - size.getWidth()) + ((int) f(view)), (view.getHeight() + size.getHeight()) * (-1)));
            case 6:
                return new v(new Point((view.getWidth() / 2) - ((int) f(view)), (view.getHeight() + size.getHeight()) * (-1)));
            case 7:
                return new v(new Point(view.getWidth(), (int) ((f(view) + (view.getHeight() / 2)) * (-1))));
            case 8:
                return new v(new Point(view.getWidth(), ((size.getHeight() / 2) * (-1)) - (view.getHeight() / 2)));
            case 9:
                return new v(new Point(view.getWidth(), (int) (f(view) + ((size.getHeight() * (-1)) - (view.getHeight() / 2)))));
            case 10:
                return new v(new Point(size.getWidth() * (-1), (int) ((f(view) + (view.getHeight() / 2)) * (-1))));
            case 11:
                return new v(new Point(size.getWidth() * (-1), ((size.getHeight() / 2) * (-1)) - (view.getHeight() / 2)));
            case 12:
                return new v(new Point(size.getWidth() * (-1), (int) (f(view) + ((size.getHeight() * (-1)) - (view.getHeight() / 2)))));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static float f(View view) {
        return (view.getResources().getDimension(y.popover_educational_caret_size) / 2) + dl2.b.E0(view, eo1.a.space_500);
    }

    public final boolean c() {
        if (((byte[]) this.f68320e) == null) {
            i(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!((File) this.f68322g).exists()) {
            try {
                if (!((File) this.f68322g).createNewFile()) {
                    i(4, null);
                    return false;
                }
            } catch (IOException unused) {
                i(4, null);
                return false;
            }
        } else if (!((File) this.f68322g).canWrite()) {
            i(4, null);
            return false;
        }
        this.f68316a = true;
        return true;
    }

    public final void d() {
        PopupWindow popupWindow = (PopupWindow) this.f68317b;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final ViewGroup e(View view, boolean z13) {
        Object parent = view.getParent();
        if (parent == null) {
            return null;
        }
        return ((parent instanceof ScrollView) && z13) ? (ViewGroup) parent : (!(parent instanceof ViewGroup) || z13) ? e((View) parent, false) : (ViewGroup) parent;
    }

    public final FileInputStream g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e13) {
            String message = e13.getMessage();
            if (message != null && message.contains("compressed")) {
                ((d) this.f68319d).c();
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0107 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ha.a h() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ha.a.h():ha.a");
    }

    public final void i(int i13, Serializable serializable) {
        ((Executor) this.f68318c).execute(new v.j(this, i13, serializable, 6));
    }

    public final void j(View anchorView, t config, Function1 popoverState, Function1 eventIntake, Function0 function0, Function0 function02, Function0 function03, Function0 function04, final Function1 result) {
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(popoverState, "popoverState");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        Intrinsics.checkNotNullParameter(result, "result");
        this.f68318c = anchorView;
        this.f68324i = function0;
        this.f68325j = function02;
        this.f68326k = function03;
        this.f68323h = result;
        this.f68320e = config;
        PopupWindow popupWindow = (PopupWindow) this.f68317b;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        Context context = anchorView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltPopoverMessage gestaltPopoverMessage = new GestaltPopoverMessage(6, context, (AttributeSet) null);
        yl1.j eventHandler = new yl1.j(3, eventIntake);
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        GestaltPopoverMessage T = ((GestaltPopoverMessage) gestaltPopoverMessage.f49478z.c(eventHandler, new ym1.k(1, gestaltPopoverMessage, GestaltPopoverMessage.class, "onBindEventHandler", "onBindEventHandler(Lcom/pinterest/gestalt/component/GestaltComponentBinding$GestaltEventHandler;)V", 0))).T(new al1.j(10, popoverState));
        PopupWindow popupWindow2 = new PopupWindow(anchorView.getContext());
        popupWindow2.setOutsideTouchable(true);
        popupWindow2.setClippingEnabled(false);
        T.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        popupWindow2.setContentView(T);
        this.f68319d = new Size(popupWindow2.getContentView().getMeasuredWidth(), popupWindow2.getContentView().getMeasuredHeight());
        Rect rect = new Rect();
        anchorView.getGlobalVisibleRect(rect);
        ym1.e eVar = config.f139456a;
        if (eVar == null) {
            eVar = a(rect, (Size) this.f68319d);
        }
        if (eVar == null) {
            result.invoke(u.POPOVER_POSITION_NOT_RESOLVED);
            return;
        }
        T.T(new ql1.k(eVar, 29));
        popupWindow2.getContentView().measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        Unit unit = Unit.f80348a;
        Size size = new Size(popupWindow2.getContentView().getMeasuredWidth(), popupWindow2.getContentView().getMeasuredHeight());
        this.f68319d = size;
        v b13 = b(anchorView, size, eVar);
        popupWindow2.setBackgroundDrawable(new ColorDrawable(0));
        Point point = b13.f139457a;
        popupWindow2.showAsDropDown(anchorView, point.x, point.y);
        if (function04 != null) {
            function04.invoke();
        }
        popupWindow2.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: ym1.q
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ViewTreeObserver viewTreeObserver;
                View contentView;
                ha.a this$0 = ha.a.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function1 result2 = result;
                Intrinsics.checkNotNullParameter(result2, "$result");
                if (!this$0.f68316a) {
                    result2.invoke(u.DISMISSED);
                }
                PopupWindow popupWindow3 = (PopupWindow) this$0.f68317b;
                if (popupWindow3 != null && (contentView = popupWindow3.getContentView()) != null) {
                    contentView.removeOnLayoutChangeListener((View.OnLayoutChangeListener) this$0.f68322g);
                }
                View view = (View) this$0.f68318c;
                if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                    viewTreeObserver.removeOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener) this$0.f68321f);
                }
                this$0.f68317b = null;
                this$0.f68316a = false;
            }
        });
        ViewGroup e13 = e(anchorView, false);
        z91.l lVar = new z91.l(24, function02);
        if (e13 != null) {
            e13.setOnTouchListener(new s(this, anchorView, lVar));
        }
        this.f68322g = new r(e(anchorView, true), popupWindow2, new z91.l(25, function03));
        popupWindow2.getContentView().addOnLayoutChangeListener((View.OnLayoutChangeListener) this.f68322g);
        this.f68321f = new e2(this, 4);
        anchorView.getViewTreeObserver().addOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener) this.f68321f);
        this.f68317b = popupWindow2;
    }

    public final void l() {
        ByteArrayOutputStream byteArrayOutputStream;
        b[] bVarArr = (b[]) this.f68326k;
        byte[] bArr = (byte[]) this.f68320e;
        if (bVarArr == null || bArr == null) {
            return;
        }
        if (!this.f68316a) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (IOException e13) {
            ((d) this.f68319d).i(7, e13);
        } catch (IllegalStateException e14) {
            ((d) this.f68319d).i(8, e14);
        }
        try {
            byteArrayOutputStream.write(h.f68341a);
            byteArrayOutputStream.write(bArr);
            if (h.j(byteArrayOutputStream, bArr, bVarArr)) {
                this.f68321f = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.f68326k = null;
            } else {
                ((d) this.f68319d).i(5, null);
                this.f68326k = null;
                byteArrayOutputStream.close();
            }
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final boolean m() {
        byte[] bArr = (byte[]) this.f68321f;
        if (bArr == null) {
            return false;
        }
        if (!this.f68316a) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream((File) this.f68322g);
                    try {
                        FileChannel channel = fileOutputStream.getChannel();
                        try {
                            FileLock tryLock = channel.tryLock();
                            if (tryLock != null) {
                                try {
                                    if (tryLock.isValid()) {
                                        byte[] bArr2 = new byte[BitmapUtils.BITMAP_TO_JPEG_SIZE];
                                        while (true) {
                                            int read = byteArrayInputStream.read(bArr2);
                                            if (read <= 0) {
                                                i(1, null);
                                                tryLock.close();
                                                channel.close();
                                                fileOutputStream.close();
                                                byteArrayInputStream.close();
                                                return true;
                                            }
                                            fileOutputStream.write(bArr2, 0, read);
                                        }
                                    }
                                } finally {
                                }
                            }
                            throw new IOException("Unable to acquire a lock on the underlying file channel.");
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th3) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (FileNotFoundException e13) {
                i(6, e13);
                return false;
            } catch (IOException e14) {
                i(7, e14);
                return false;
            }
        } finally {
            this.f68321f = null;
            this.f68326k = null;
        }
    }

    public a(AssetManager assetManager, o.a aVar, d dVar, String str, File file) {
        byte[] bArr;
        this.f68316a = false;
        this.f68317b = assetManager;
        this.f68318c = aVar;
        this.f68319d = dVar;
        this.f68323h = str;
        this.f68324i = "dexopt/baseline.prof";
        this.f68325j = "dexopt/baseline.profm";
        this.f68322g = file;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 31) {
            bArr = h.f68343c;
        } else {
            switch (i13) {
                case 26:
                    bArr = h.f68346f;
                    break;
                case 27:
                    bArr = h.f68345e;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = h.f68344d;
                    break;
                default:
                    bArr = null;
                    break;
            }
        }
        this.f68320e = bArr;
    }
}
