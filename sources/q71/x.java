package q71;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.speech.SpeechRecognizer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.search.typeahead.view.TypeaheadSearchBarContainer;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.f3;
import net.quikkly.android.utils.BitmapUtils;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lq71/x;", "Lyq0/b0;", "Lyq0/a0;", "Lk71/o;", "<init>", "()V", "searchLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class x extends i<yq0.a0> implements k71.o {
    public static final /* synthetic */ int O0 = 0;
    public nu1.a A0;
    public f3 B0;
    public o71.x C0;
    public h61.n D0;
    public TypeaheadSearchBarContainer G0;
    public Integer H0;
    public SpeechRecognizer J0;
    public boolean K0;
    public boolean L0;

    /* renamed from: z0, reason: collision with root package name */
    public ny1.w f102781z0;
    public String E0 = "";
    public final xk2.v F0 = xk2.m.b(v.f102769j);
    public Boolean I0 = Boolean.TRUE;
    public final d4 M0 = d4.SEARCH;
    public final a4 N0 = a4.SEARCH_AUTOCOMPLETE;

    public static final void U8(x xVar) {
        SpeechRecognizer speechRecognizer = xVar.J0;
        if (speechRecognizer != null) {
            speechRecognizer.cancel();
        }
        TypeaheadSearchBarContainer typeaheadSearchBarContainer = xVar.G0;
        if (typeaheadSearchBarContainer == null) {
            Intrinsics.r("searchBarContainer");
            throw null;
        }
        typeaheadSearchBarContainer.a();
        TypeaheadSearchBarContainer typeaheadSearchBarContainer2 = xVar.G0;
        if (typeaheadSearchBarContainer2 != null) {
            typeaheadSearchBarContainer2.o(i42.c.search_view_hint);
        } else {
            Intrinsics.r("searchBarContainer");
            throw null;
        }
    }

    @Override // yq0.t, yk1.k, nl1.d
    public final void K7() {
        super.K7();
        TypeaheadSearchBarContainer typeaheadSearchBarContainer = this.G0;
        if (typeaheadSearchBarContainer != null) {
            typeaheadSearchBarContainer.c();
        } else {
            Intrinsics.r("searchBarContainer");
            throw null;
        }
    }

    @Override // yq0.t, yk1.k, nl1.d
    public final void L7() {
        TypeaheadSearchBarContainer typeaheadSearchBarContainer = this.G0;
        if (typeaheadSearchBarContainer == null) {
            Intrinsics.r("searchBarContainer");
            throw null;
        }
        hf0.b.k(typeaheadSearchBarContainer);
        super.L7();
    }

    public void P2(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        D5();
    }

    @Override // nl1.d
    public void R7(Navigation navigation) {
        super.R7(navigation);
        if (navigation != null) {
            String v03 = navigation.v0("com.pinterest.EXTRA_SEARCH_PREFILLED_QUERY");
            if (v03 == null) {
                v03 = "";
            }
            this.E0 = v03;
            String v04 = navigation.v0("com.pinterest.EXTRA_SEARCH_RESULTS_TAB_TYPE");
            if (v04 != null) {
                h61.n.Companion.getClass();
                this.D0 = h61.l.a(v04);
            }
            this.L0 = navigation.S("com.pinterest.EXTRA_START_VOICE_SEARCH", false);
        }
    }

    public final lq0.e0 V8(int i13, View.OnClickListener onClickListener, Integer num) {
        lq0.e0 e0Var = new lq0.e0(getContext(), 1);
        e0Var.b(i13);
        e0Var.setOnClickListener(onClickListener);
        if (num != null) {
            e0Var.setId(num.intValue());
        }
        return e0Var;
    }

    public final f3 W8() {
        f3 f3Var = this.B0;
        if (f3Var != null) {
            return f3Var;
        }
        Intrinsics.r("experiments");
        throw null;
    }

    public final void X8() {
        Context context = getContext();
        if (context != null) {
            ny1.y yVar = ny1.y.f92715f;
            if (yVar.a(context)) {
                a9();
                return;
            }
            ny1.w wVar = this.f102781z0;
            if (wVar == null) {
                Intrinsics.r("permissionsManager");
                throw null;
            }
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.f(requireActivity);
            wVar.c(requireActivity, yVar, (r23 & 4) != 0 ? "" : null, null, (r23 & 16) != 0 ? ny1.o.f92679j : null, ny1.q.f92690k, ny1.t.f92699j, (r23 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? ny1.t.f92700k : new w(this, 0), (r23 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? ny1.t.f92701l : null, (r23 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? ny1.t.f92702m : null, (r23 & 1024) != 0 ? ny1.t.f92703n : new w(this, 1));
        }
    }

    public final void Y8(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        TypeaheadSearchBarContainer typeaheadSearchBarContainer = this.G0;
        if (typeaheadSearchBarContainer != null) {
            typeaheadSearchBarContainer.j(query);
        } else {
            Intrinsics.r("searchBarContainer");
            throw null;
        }
    }

    public final void Z8(boolean z13) {
        this.I0 = Boolean.valueOf(z13);
    }

    public final void a9() {
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.LANGUAGE", Locale.getDefault());
        intent.putExtra("android.speech.extra.MAX_RESULTS", 1);
        try {
            SpeechRecognizer speechRecognizer = this.J0;
            if (speechRecognizer != null) {
                speechRecognizer.startListening(intent);
            }
        } catch (Exception unused) {
            Toast.makeText(E4(), i42.c.speech_recognition_not_supported_message, 0).show();
            s7().h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.SEARCH_PINS, (r18 & 2) != 0 ? null : h32.u0.VOICE_SEARCH_FAILURE, (r18 & 4) != 0 ? null : h32.g0.SEARCH_BOX, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : ep.b.o("error_message", "User device doesn't support Speech Recognition"), (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        }
    }

    /* renamed from: getViewParameterType, reason: from getter */
    public a4 getN0() {
        return this.N0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getM0() {
        return this.M0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(k42.e.fragment_search_typeahead, k42.d.p_recycler_view);
        eVar.b(k42.d.loading_container);
        return eVar;
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(k42.d.view_typeahead_search_bar_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        TypeaheadSearchBarContainer typeaheadSearchBarContainer = (TypeaheadSearchBarContainer) findViewById;
        this.G0 = typeaheadSearchBarContainer;
        if (typeaheadSearchBarContainer == null) {
            Intrinsics.r("searchBarContainer");
            throw null;
        }
        Integer num = this.H0;
        typeaheadSearchBarContainer.o(num != null ? num.intValue() : i42.c.search_view_hint);
        TypeaheadSearchBarContainer typeaheadSearchBarContainer2 = this.G0;
        if (typeaheadSearchBarContainer2 == null) {
            Intrinsics.r("searchBarContainer");
            throw null;
        }
        typeaheadSearchBarContainer2.k(this.I0);
        v8();
        f3 W8 = W8();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        if (!ve.h.W(W8, requireContext) ? !(!ve.h.V() || !W8().a()) : !(!ve.h.V() || !W8().b())) {
            SpeechRecognizer createSpeechRecognizer = SpeechRecognizer.createSpeechRecognizer(requireContext());
            this.J0 = createSpeechRecognizer;
            if (createSpeechRecognizer != null) {
                createSpeechRecognizer.setRecognitionListener(new u(this));
            }
            TypeaheadSearchBarContainer typeaheadSearchBarContainer3 = this.G0;
            if (typeaheadSearchBarContainer3 == null) {
                Intrinsics.r("searchBarContainer");
                throw null;
            }
            typeaheadSearchBarContainer3.b();
            typeaheadSearchBarContainer3.l();
            Animation loadAnimation = AnimationUtils.loadAnimation(typeaheadSearchBarContainer3.getContext(), m60.n0.wiggle);
            f3 W82 = W8();
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            if (!ve.h.W(W82, requireContext2) || !W8().c()) {
                Intrinsics.f(loadAnimation);
                typeaheadSearchBarContainer3.n(loadAnimation);
            }
            typeaheadSearchBarContainer3.m(new t(this));
            s7().h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.VIEW, (r18 & 2) != 0 ? null : h32.u0.SEARCH_BOX_VOICE_INPUT, (r18 & 4) != 0 ? null : h32.g0.SEARCH_BOX, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            if (this.L0) {
                X8();
                this.L0 = false;
            }
        }
        return onCreateView;
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        SpeechRecognizer speechRecognizer = this.J0;
        if (speechRecognizer != null) {
            speechRecognizer.destroy();
        }
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onPause() {
        Window window;
        FragmentActivity E4 = E4();
        if (E4 != null && (window = E4.getWindow()) != null) {
            window.setSoftInputMode(32);
        }
        super.onPause();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public void onResume() {
        Window window;
        super.onResume();
        FragmentActivity E4 = E4();
        if (E4 == null || (window = E4.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(16);
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        f3 W8 = W8();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        H8(0, 0, 0, getResources().getDimensionPixelOffset(ve.h.W(W8, requireContext) ? m60.r0.search_toolbar_gestalt_height : eo1.c.space_1600));
        tq0.h hVar = (tq0.h) this.F0.getValue();
        hVar.n(new tq0.l(pb0.g.f99432a, s7()), new z61.a(s7(), 1));
        Intrinsics.checkNotNullParameter(this, "observable");
        addRecyclerViewEventListener(hVar);
    }
}
