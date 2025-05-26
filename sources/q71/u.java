package q71;

import android.os.Bundle;
import android.speech.RecognitionListener;
import android.view.KeyEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;
import androidx.appcompat.widget.SearchView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.search.results.view.SearchBarView;
import com.pinterest.feature.search.typeahead.view.TypeaheadGestaltSearchBarContainer;
import com.pinterest.feature.search.typeahead.view.TypeaheadLegacySearchBarContainer;
import com.pinterest.feature.search.typeahead.view.TypeaheadSearchBarContainer;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u implements RecognitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f102766a;

    public u(x xVar) {
        this.f102766a = xVar;
    }

    @Override // android.speech.RecognitionListener
    public final void onBeginningOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public final void onBufferReceived(byte[] bArr) {
    }

    @Override // android.speech.RecognitionListener
    public final void onEndOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public final void onError(int i13) {
        x xVar = this.f102766a;
        if (xVar.K0) {
            xVar.K0 = false;
            return;
        }
        Toast.makeText(xVar.E4(), i42.c.speech_recognition_error_message, 0).show();
        x.U8(xVar);
        nx.d0 s73 = xVar.s7();
        h32.f1 f1Var = h32.f1.SEARCH_PINS;
        h32.g0 g0Var = h32.g0.SEARCH_BOX;
        h32.u0 u0Var = h32.u0.VOICE_SEARCH_FAILURE;
        HashMap hashMap = new HashMap();
        hashMap.put("error_message", String.valueOf(i13));
        s73.h0((r18 & 1) != 0 ? h32.f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    @Override // android.speech.RecognitionListener
    public final void onEvent(int i13, Bundle bundle) {
    }

    @Override // android.speech.RecognitionListener
    public final void onPartialResults(Bundle bundle) {
    }

    @Override // android.speech.RecognitionListener
    public final void onReadyForSpeech(Bundle bundle) {
        x xVar = this.f102766a;
        TypeaheadSearchBarContainer typeaheadSearchBarContainer = xVar.G0;
        if (typeaheadSearchBarContainer == null) {
            Intrinsics.r("searchBarContainer");
            throw null;
        }
        typeaheadSearchBarContainer.o(i42.c.start_listening_hint);
        Animation loadAnimation = AnimationUtils.loadAnimation(xVar.requireContext(), m60.n0.pulse_voice);
        TypeaheadSearchBarContainer typeaheadSearchBarContainer2 = xVar.G0;
        if (typeaheadSearchBarContainer2 == null) {
            Intrinsics.r("searchBarContainer");
            throw null;
        }
        Intrinsics.f(loadAnimation);
        typeaheadSearchBarContainer2.n(loadAnimation);
    }

    @Override // android.speech.RecognitionListener
    public final void onResults(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle != null ? bundle.getStringArrayList("results_recognition") : null;
        x xVar = this.f102766a;
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            Toast.makeText(xVar.E4(), i42.c.speech_recognition_error_message, 0).show();
            xVar.s7().h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.SEARCH_PINS, (r18 & 2) != 0 ? null : h32.u0.VOICE_SEARCH_FAILURE, (r18 & 4) != 0 ? null : h32.g0.SEARCH_BOX, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : ep.b.o("error_message", "Empty query"), (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            return;
        }
        String str = stringArrayList.get(0);
        TypeaheadSearchBarContainer typeaheadSearchBarContainer = xVar.G0;
        if (typeaheadSearchBarContainer == null) {
            Intrinsics.r("searchBarContainer");
            throw null;
        }
        Intrinsics.f(str);
        typeaheadSearchBarContainer.j(str);
        TypeaheadSearchBarContainer typeaheadSearchBarContainer2 = xVar.G0;
        if (typeaheadSearchBarContainer2 == null) {
            Intrinsics.r("searchBarContainer");
            throw null;
        }
        TypeaheadGestaltSearchBarContainer d2 = typeaheadSearchBarContainer2.d();
        if (d2 != null) {
            c0.d.j(d2.f47910a, q.f102754z);
            SearchView searchView = (SearchView) d2.f47910a.findViewById(cn1.f0.gestalt_search_field);
            searchView.w(searchView.f16425p.getText(), true);
        }
        TypeaheadLegacySearchBarContainer e13 = typeaheadSearchBarContainer2.e();
        if (e13 != null) {
            SearchBarView searchBarView = e13.f47917c;
            searchBarView.getClass();
            KeyEvent keyEvent = new KeyEvent(0, 66);
            KeyEvent keyEvent2 = new KeyEvent(1, 66);
            searchBarView.dispatchKeyEvent(keyEvent);
            searchBarView.dispatchKeyEvent(keyEvent2);
        }
        xVar.s7().h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.SEARCH_PINS, (r18 & 2) != 0 ? null : h32.u0.VOICE_SEARCH_SUCCESS, (r18 & 4) != 0 ? null : h32.g0.SEARCH_BOX, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : ep.b.o("query", str), (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    @Override // android.speech.RecognitionListener
    public final void onRmsChanged(float f13) {
    }
}
