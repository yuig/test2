package x4;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import kh2.n3;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public int f131717a;

    /* renamed from: e, reason: collision with root package name */
    public int f131721e;

    /* renamed from: f, reason: collision with root package name */
    public final f f131722f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.constraintlayout.widget.k f131723g;

    /* renamed from: j, reason: collision with root package name */
    public int f131726j;

    /* renamed from: k, reason: collision with root package name */
    public String f131727k;

    /* renamed from: o, reason: collision with root package name */
    public final Context f131731o;

    /* renamed from: b, reason: collision with root package name */
    public int f131718b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f131719c = false;

    /* renamed from: d, reason: collision with root package name */
    public int f131720d = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f131724h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f131725i = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f131728l = 0;

    /* renamed from: m, reason: collision with root package name */
    public String f131729m = null;

    /* renamed from: n, reason: collision with root package name */
    public int f131730n = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f131732p = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f131733q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f131734r = -1;

    /* renamed from: s, reason: collision with root package name */
    public int f131735s = -1;

    /* renamed from: t, reason: collision with root package name */
    public int f131736t = -1;

    /* renamed from: u, reason: collision with root package name */
    public int f131737u = -1;

    public d0(Context context, XmlResourceParser xmlResourceParser) {
        char c13;
        this.f131731o = context;
        try {
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (name.equals("ConstraintOverride")) {
                                c13 = 2;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                c13 = 1;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                c13 = 0;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case 366511058:
                            if (name.equals("CustomMethod")) {
                                c13 = 4;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case 1791837707:
                            if (name.equals("CustomAttribute")) {
                                c13 = 3;
                                break;
                            }
                            c13 = 65535;
                            break;
                        default:
                            c13 = 65535;
                            break;
                    }
                    if (c13 == 0) {
                        b(context, xmlResourceParser);
                    } else if (c13 == 1) {
                        this.f131722f = new f(context, xmlResourceParser);
                    } else if (c13 == 2) {
                        this.f131723g = androidx.constraintlayout.widget.p.d(context, xmlResourceParser);
                    } else if (c13 == 3 || c13 == 4) {
                        androidx.constraintlayout.widget.c.e(context, xmlResourceParser, this.f131723g.f17769g);
                    } else {
                        Log.e("ViewTransition", n3.u() + " unknown tag " + name);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(".xml:");
                        sb3.append(xmlResourceParser.getLineNumber());
                        Log.e("ViewTransition", sb3.toString());
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("ViewTransition".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e13) {
            e13.printStackTrace();
        } catch (XmlPullParserException e14) {
            e14.printStackTrace();
        }
    }

    public final boolean a(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if (this.f131726j == -1 && this.f131727k == null) {
            return false;
        }
        int i13 = this.f131734r;
        boolean z13 = i13 == -1 || view.getTag(i13) != null;
        int i14 = this.f131735s;
        boolean z14 = i14 == -1 || view.getTag(i14) == null;
        if (z13 && z14) {
            if (view.getId() == this.f131726j) {
                return true;
            }
            if (this.f131727k != null && (view.getLayoutParams() instanceof ConstraintLayout.LayoutParams) && (str = ((ConstraintLayout.LayoutParams) view.getLayoutParams()).Y) != null && str.matches(this.f131727k)) {
                return true;
            }
        }
        return false;
    }

    public final void b(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.s.ViewTransition);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i13 = 0; i13 < indexCount; i13++) {
            int index = obtainStyledAttributes.getIndex(i13);
            if (index == androidx.constraintlayout.widget.s.ViewTransition_android_id) {
                this.f131717a = obtainStyledAttributes.getResourceId(index, this.f131717a);
            } else if (index == androidx.constraintlayout.widget.s.ViewTransition_motionTarget) {
                if (MotionLayout.f17523m0) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f131726j);
                    this.f131726j = resourceId;
                    if (resourceId == -1) {
                        this.f131727k = obtainStyledAttributes.getString(index);
                    }
                } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                    this.f131727k = obtainStyledAttributes.getString(index);
                } else {
                    this.f131726j = obtainStyledAttributes.getResourceId(index, this.f131726j);
                }
            } else if (index == androidx.constraintlayout.widget.s.ViewTransition_onStateTransition) {
                this.f131718b = obtainStyledAttributes.getInt(index, this.f131718b);
            } else if (index == androidx.constraintlayout.widget.s.ViewTransition_transitionDisable) {
                this.f131719c = obtainStyledAttributes.getBoolean(index, this.f131719c);
            } else if (index == androidx.constraintlayout.widget.s.ViewTransition_pathMotionArc) {
                this.f131720d = obtainStyledAttributes.getInt(index, this.f131720d);
            } else if (index == androidx.constraintlayout.widget.s.ViewTransition_duration) {
                this.f131724h = obtainStyledAttributes.getInt(index, this.f131724h);
            } else if (index == androidx.constraintlayout.widget.s.ViewTransition_upDuration) {
                this.f131725i = obtainStyledAttributes.getInt(index, this.f131725i);
            } else if (index == androidx.constraintlayout.widget.s.ViewTransition_viewTransitionMode) {
                this.f131721e = obtainStyledAttributes.getInt(index, this.f131721e);
            } else if (index == androidx.constraintlayout.widget.s.ViewTransition_motionInterpolator) {
                int i14 = obtainStyledAttributes.peekValue(index).type;
                if (i14 == 1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                    this.f131730n = resourceId2;
                    if (resourceId2 != -1) {
                        this.f131728l = -2;
                    }
                } else if (i14 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f131729m = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.f131728l = -1;
                    } else {
                        this.f131730n = obtainStyledAttributes.getResourceId(index, -1);
                        this.f131728l = -2;
                    }
                } else {
                    this.f131728l = obtainStyledAttributes.getInteger(index, this.f131728l);
                }
            } else if (index == androidx.constraintlayout.widget.s.ViewTransition_setsTag) {
                this.f131732p = obtainStyledAttributes.getResourceId(index, this.f131732p);
            } else if (index == androidx.constraintlayout.widget.s.ViewTransition_clearsTag) {
                this.f131733q = obtainStyledAttributes.getResourceId(index, this.f131733q);
            } else if (index == androidx.constraintlayout.widget.s.ViewTransition_ifTagSet) {
                this.f131734r = obtainStyledAttributes.getResourceId(index, this.f131734r);
            } else if (index == androidx.constraintlayout.widget.s.ViewTransition_ifTagNotSet) {
                this.f131735s = obtainStyledAttributes.getResourceId(index, this.f131735s);
            } else if (index == androidx.constraintlayout.widget.s.ViewTransition_SharedValueId) {
                this.f131737u = obtainStyledAttributes.getResourceId(index, this.f131737u);
            } else if (index == androidx.constraintlayout.widget.s.ViewTransition_SharedValue) {
                this.f131736t = obtainStyledAttributes.getInteger(index, this.f131736t);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final String toString() {
        return "ViewTransition(" + n3.w(this.f131731o, this.f131717a) + ")";
    }
}
