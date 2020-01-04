package org.enclojure.ide.nb.actions;

import clojure.lang.RT;
import clojure.lang.Var;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.util.Exceptions;

public final class SwitchEditorReplFocusEvent implements ActionListener {

    static final Var switchReplFocusFn =
        RT.var("org.enclojure.ide.nb.actions.action-handler", "switch-repl-focus-action");

    public void actionPerformed(ActionEvent e) {
        try {
            RT.load("org/enclojure/ide/nb/actions/action_handler");
            switchReplFocusFn.invoke();
        } catch (Exception ex) {
            Exceptions.printStackTrace(ex);
        }
    }
}
