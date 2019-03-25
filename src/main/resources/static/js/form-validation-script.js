var Script = function () {

    $.validator.setDefaults({
        submitHandler: function() { alert("submitted!"); }
    });

    $().ready(function() {
        // validate the comment form when it is submitted
        $("#feedback_form").validate();

        // validate signup form on keyup and submit
        $("#register_form").validate({
            rules: {
            	tibadah: {
            		required: true
            	},
            	jpria: {
            		required: true
            	},
				jwanita: {
					required: true
				},
				npengkhotbah: {
					required: true,
					minlength: 3
				},
				jpersembahan: {
					required: true
				},
				jorangbaru: {
					required: true
				},
                fullname: {
                    required: true,
                    minlength: 6
                },
                address: {
                    required: true,
                    minlength: 10
                },
                username: {
                    required: true,
                    minlength: 5
                },
                password: {
                    required: true,
                    minlength: 5
                },
                confirm_password: {
                    required: true,
                    minlength: 5,
                    equalTo: "#password"
                },
                email: {
                    required: true,
                    email: true
                },
                topic: {
                    required: "#newsletter:checked",
                    minlength: 2
                },
                agree: "required"
            },
            messages: {
				tibadah: {
                    required: "Tanggal Ibadah harus diisi!.",                    
                },
				jwanita: {
                    required: "Jumlah Wanita harus diisi!.",
                    
                },
				jpria: {
                    required: "Jumlah Pria harus diisi!.",
                    
                },
				jorangbaru: {
                    required: "Jumlah Orang Baru harus diisi!.",
                    
                },
				jpersembahan: {
                    required: "Jumlah Persembahan harus diisi!.",
                    
                },				
				npengkhotbah: {
                    required: "Nama Pengkhotbah harus diisi!.",
                    minlength: "Minimum panjang karakter 3."
                },				
                fullname: {
                    required: "Please enter a Full Name.",
                    minlength: "Your Full Name must consist of at least 6 characters long."
                },
                address: {
                    required: "Please enter a Address.",
                    minlength: "Your Address must consist of at least 10 characters long."
                },
                username: {
                    required: "Please enter a Username.",
                    minlength: "Your username must consist of at least 5 characters long."
                },
                password: {
                    required: "Please provide a password.",
                    minlength: "Your password must be at least 5 characters long."
                },
                confirm_password: {
                    required: "Please provide a password.",
                    minlength: "Your password must be at least 5 characters long.",
                    equalTo: "Please enter the same password as above."
                },
                email: "Please enter a valid email address.",
                agree: "Please accept our terms & condition."
            }
        });

        // validasi form_crew.html
        $("form_crew").validate({
        	rules: {
        		ncrew: { required: true, minlength: 3},
        		npemimpincrew: {required: true, minlength: 3}
        	},
        	messages: {
        		ncrew: { required: "Nama Crew harus diisi!", 
        				 minlength: "Minimal panjang adalah 3 karakter!"},
        		npemimpincrew: {required: "Nama Pemimpin Crew harus diisi!", 
        					    minlength: "Minimal panjang adalah 3 karakter!"},
        					    
        	}
        });
        
     // validasi form_jemaat.html
        $("form_jemaat").validate({
        	rules: {
        		
        	},
        	messages: {}
        });
        
        // propose username by combining first- and lastname
        $("#username").focus(function() {
            var firstname = $("#firstname").val();
            var lastname = $("#lastname").val();
            if(firstname && lastname && !this.value) {
                this.value = firstname + "." + lastname;
            }
        });

        //code to hide topic selection, disable for demo
        var newsletter = $("#newsletter");
        // newsletter topics are optional, hide at first
        var inital = newsletter.is(":checked");
        var topics = $("#newsletter_topics")[inital ? "removeClass" : "addClass"]("gray");
        var topicInputs = topics.find("input").attr("disabled", !inital);
        // show when newsletter is checked
        newsletter.click(function() {
            topics[this.checked ? "removeClass" : "addClass"]("gray");
            topicInputs.attr("disabled", !this.checked);
        });
    });


}();